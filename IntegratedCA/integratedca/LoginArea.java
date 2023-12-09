package integratedca;
S
import java.util.ArrayList;
import java.util.Scanner;


public class LoginArea {

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}

public class MovieRentalApp {
   
    private ArrayList<Movie> movies;
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    private Scanner scanner;
    private User currentCustomer;

    public User getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(User currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public MovieRentalApp() {
        movies = new ArrayList<>();
        scanner = new Scanner(System.in);
        currentCustomer = null;
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
}



   