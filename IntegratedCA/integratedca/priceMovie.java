/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

/**
 *
 * @author Xinyi 2021244
 */
public class priceMovie {
    
	int num;
	
	String movie;
	int price;
	
	Movie_price(){
}
	
	Movie_price(int num ,String movie,int price){
		this.num=num;	
		this.movie=movie;
		this.price=price;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}