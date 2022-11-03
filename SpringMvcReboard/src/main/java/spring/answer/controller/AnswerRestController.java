package spring.answer.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.answer.model.AnswerDao;
import spring.day1026.data.BoardDao;
import spring.day1026.data.BoardDto;

@RestController
public class AnswerRestController {

	@Autowired
	AnswerDao adao;
	
	@Autowired
	BoardDao dao;
	
	// jason파일을 0아니면 1로 받을거기 때문에 integer
	@GetMapping("/board/adelete") //ajax 매핑주소는 내알아서
	public HashMap<String, Integer> answerDelete(
			@RequestParam int idx,
			@RequestParam String pass
			){
		int check=adao.getCheckPass(idx, pass);
		
		if(check==1) {
			adao.deleteAnswer(idx);
		}
		
		HashMap<String, Integer> map =new HashMap<String, Integer>();
		map.put("check", check); //check로 1인지 0인지를 넘김
		
		return map;
	}
	
	@GetMapping("rest/ajaxlist1")
	public Map<String, Object> abc(){ // 꼭 map일 필요는 없음 일반 리스트처럼 처리해도 ok 
		
		List<Map<String, Object>> dataList = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> data = null;
		List<BoardDto> sangList = dao.getList2(); // DB에서 데이터를 받아온다.
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

		for(BoardDto s : sangList) {
			data = new HashMap<String, Object>();
			data.put("writer", s.getWriter()); // key, value 형식으로 DB값을 담는다. 
			data.put("subject", s.getSubject());
			data.put("content", s.getContent());
			data.put("writeday", sdf.format(s.getWriteday()));
			data.put("photo", s.getPhoto());
			dataList.add(data); // List에 Record 값을 넣는다.
		}
		
		Map<String, Object> sangpumDatas = new HashMap<String, Object>();
		sangpumDatas.put("datas", dataList); // Map에 List를 담아 전송한다.
		
		return sangpumDatas; // JSON은 Map을 리턴해야한다.
	}
	
	
	
	
}
