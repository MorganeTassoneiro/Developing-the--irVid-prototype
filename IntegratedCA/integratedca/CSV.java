/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xinyi 2021244
 */
public class CSV {
    public static void main(String[] args) {
  String filePath = "src\\com.EMR_system\\user.csv";
  
  System.out.println("starting write user.csv file: " + filePath);
  CSV(filePath);
  
  System.out.println("starting read user.csv file");
  readCsv(filePath);
 }
 
 public static void CSV(String filePath) {
  List<priceMovie> users = new ArrayList<priceMovie>();
  
  
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
	
	users.add(m1);
	users.add(m2);
	users.add(m3);
	users.add(m4);
	users.add(m5);
	users.add(m6);
	users.add(m7);
	users.add(m8);
	users.add(m9);
	users.add(m10);
        users.add(m11);
         
  FileWriter fileWriter = null;
  try {
   fileWriter = new FileWriter(filePath);
   
   fileWriter.append("Number, Movie Name, Price\n");
   for(priceMovie u: users) {
    fileWriter.append(String.valueOf(u.getNum()));
    fileWriter.append(",");
    fileWriter.append(u.getMovie());
    fileWriter.append(",");
    fileWriter.append(String.valueOf(u.getPrice()));
    fileWriter.append("\n");
   }
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    fileWriter.flush();
    fileWriter.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 }
 
 public static void readCsv(String filePath) {
  BufferedReader reader = null;
  
  try {
   List<priceMovie> users = new ArrayList<priceMovie>();
   String line = "";
   reader = new BufferedReader(new FileReader(filePath));
   reader.readLine();
   
   while((line = reader.readLine()) != null) {
    String[] fields = line.split(",");
    
    if(fields.length > 0) {
     priceMovie user = new priceMovie();
     user.setNum(Integer.parseInt(fields[0]));
     user.setMovie(fields[1]);
     user.setPrice(Integer.parseInt(fields[2]));
     users.add(user);
    }
   }
   
   for(priceMovie u: users) {
    System.out.printf("[userId=%d, firstName=%s, lastName=%s]\n", u.getNum(), u.getMovie(), u.getPrice());
   }
   
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    reader.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
  
 }
    
}
