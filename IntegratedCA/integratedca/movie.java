/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;
import java.util.*;
/**
 *
 * @author xinyi 2021244
 */
public class movie {
    
    
    





	public static void main(String[] args) {
		
		
		priceMovie m1=new priceMovie(1,"Heat", (int) 7.99);
		priceMovie m2=new priceMovie(2,"Balto", (int) 6.99);
		priceMovie m3=new priceMovie(3,"Nixon", (int) 6.99);
		priceMovie m4=new priceMovie(4,"Casino", (int) 7.99);
		priceMovie m5=new priceMovie(5,"Sense and Sensibility", (int) 6.99);
        priceMovie m6=new priceMovie(6,"Leaving Las Vegas", (int) 6.99);
        priceMovie m7=new priceMovie(7,"Twelve Monkeys", (int) 6.99);
        priceMovie m8=new priceMovie(8,"Se7en ", (int) 7.99);
        priceMovie m9=new priceMovie(9,"The Usual Suspects", (int) 7.99);
		priceMovie m10=new priceMovie(10,"A Midwinter's Tale", (int) 7.99);
        priceMovie m11=new priceMovie(11,"The Bridges of Madison County", (int) 6.99);
		
		ArrayList<priceMovie> arr=new ArrayList<priceMovie>();
		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
        arr.add(m6);
		arr.add(m7);
		arr.add(m8);
		arr.add(m9);
		arr.add(m10);
        arr.add(m11);
		
		for(priceMovie m : arr){
			System.out.println(m.num+"   "+m.movie +"   "+m.price);
		}
		

	}

}