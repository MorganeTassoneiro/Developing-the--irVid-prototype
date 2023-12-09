/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author morgane 2021327
 */
public class LoginArea {

public class MovieRentalApp {
   
    private ArrayList<Movie> movies;
    private final Scanner scanner;

    private User currentCustomer;

    public MovieRentalApp() {
        movies = new ArrayList<>();
        scanner = new Scanner(System.in);
        currentCustomer = null;
    }
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     *
     * @param movies
     */
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public User getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(User currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
    

    public void customerLogin() {

        System.out.println("Welcome to  ÉirVid!");

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();


        // It can be changed 
        User demoCustomer = new User("", "");

        if (demoCustomer.authenticate(username, password)) {
            System.out.println("Login successful to ÉirVid. Welcome, " + username + "!");
            currentCustomer = demoCustomer;

        
        } else {
            System.out.println("Try again. Login failed.");
            customerLogin(); 
        }

    }
}

class User {
    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}
}