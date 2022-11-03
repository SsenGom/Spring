package db.mysql.market;

import java.sql.Timestamp;

public class MarketDto {

	private String num;
	private String sangpum;   
	private String photoimage;   
	private String color;   
	private int price;   
	Timestamp ipgoday;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public String getPhotoimage() {
		return photoimage;
	}
	public void setPhotoimage(String photoimage) {
		this.photoimage = photoimage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Timestamp getIpgoday() {
		return ipgoday;
	}
	public void setIpgoday(Timestamp ipgoday) {
		this.ipgoday = ipgoday;
	}
	
	
	
}
