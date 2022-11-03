package spring.day1026.coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.answer.model.AnswerDaoInter;
import spring.day1026.data.BoardDaoInter;
import spring.day1026.data.BoardDto;

@Controller
public class BoardListController {

	@Autowired
	BoardDaoInter dao;
	
	@Autowired
	AnswerDaoInter adao;
	
	@GetMapping("/")
	public String start() {
		return "redirect:board/list";
	}
	
	
	@GetMapping("/board/list")
	public ModelAndView list(
			@RequestParam(value="currentpage",defaultValue = "1") int currentpage
			) {
	
		ModelAndView mview=new ModelAndView();
		
		int totalCount=dao.getTotalCount(); //총 글의 갯수
		
		//페이징에 필요한 변수
		int totalPage; //총 페이지 수
		int startPage; //각 블럭의 시작페이지
		int endPage; //각블럭의 끝 페이지
		int start; //각페이지의 싲가번호
		int perPage=7; //한페이지에 보여질 글의 갯수
		int perBlock=5; //한 블럭당 보여지는 페이지 갯수

		
		//총페이지갯수 구하기
		totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);

		//각 블럭의 시작페이지 (현재페이지 3: 시작 1 끝 5)
		//각 블럭의 시작페이지 (현재페이지 6: 시작 6 끝 10)
		startPage=(currentpage-1)/perBlock*perBlock+1;
		endPage=startPage+perBlock-1;

		//총페이지수가 8 ... 2번째 블럭은 startpage=6 endpage=10 ... endpage 8로 수정
		if(endPage>totalPage) {
		   endPage=totalPage;
		}
		//각페이지에서 블러올 시작번호
		//현재페이지가 1일경우 start 1,2 일경우 6
		start=(currentpage-1)*perPage;

		//각페이지에서 필요한 게시글 불러오기
		List<BoardDto> list=dao.getList(start, perPage);

		//list에 각글에 대한 댓글 갯수 추가
		for(BoardDto d:list)
		{
			d.setAcount(adao.getListAnswer(d.getNum()).size());
		}
		
		//각 글 앞에 붙일 시작번호
		//총글이 만약에 20... 1페이지는 20부터 2페이지는 15부터
		//출력해서 1씩 감소하면서 출력
		int no=totalCount-(currentpage-1)*perPage;
		
		//출력에 필요한 변수들을 request에 저장
		mview.addObject("list",list); //댓글이 포함된 후 전달
		mview.addObject("totalCount",totalCount);
		mview.addObject("totalPage",totalPage);
		mview.addObject("startPage",startPage);
		mview.addObject("endPage",endPage);
		mview.addObject("no",no);
		mview.addObject("currentpage",currentpage);
	
		mview.setViewName("board/boardlist");
		
		return mview;
	}
	
	@GetMapping("/rest/restlist")
	public ModelAndView allList() {
		
		ModelAndView mview=new ModelAndView();
		
		int totalCount=dao.getTotalCount(); //총 글의 갯수

		mview.addObject("totalCount",totalCount);
		
		mview.setViewName("rest/restlist"); //로케이션

		return mview;
	}
}
