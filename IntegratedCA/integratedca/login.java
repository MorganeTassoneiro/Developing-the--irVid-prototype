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
    
    private String email;
    private String password;
     
     public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
       
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
                
                // Prompt user to enter email
		System.out.println("Enter Email : ");
		String email=input.next();
                // Prompt user to enter password
		System.out.println("Enter Password: ");
		String password=input.next();
		// Display entered email and password
		System.out.println("Email :" +email);
		System.out.println("Password :" +password);
	
		
		

	}
    
}
