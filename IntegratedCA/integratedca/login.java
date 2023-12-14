/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

import java.util.Scanner;

/**
 *
 * @author xinyi 2021244
 */
public class login {
    
     String Email;
     String pwd;
    private String email;
     
     public String getEmail() {
         String email = null;
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email=input.next();
		System.out.println("Enter Password: ");
		String pwd=input.next();
		
		System.out.println("Email :" +email);
		System.out.println("Password :" +pwd);
	
		
		

	}
    
}
