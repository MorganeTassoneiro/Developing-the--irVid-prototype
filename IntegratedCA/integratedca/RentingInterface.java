/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author morgane
 */
public class RentingInterface {
    class Movie {
    String title;
    boolean rented;

    }

    private static final ArrayList<Movie> movies = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Show the lis of available movies 
     * @param newParam TODO
     */
    private static void displayMovies(Object newParam) {
        System.out.println("Available Movies:");
        for (Movie movie : movies) {
            if (!movie.rented) {
                System.out.println(movie.title);
            }
        }
    }

    /**
     * Asks the user to input the title of the movie they want to rent. 
     * @param newParam TODO
     */
    private static void rentMovie(final Object newParam) {
        System.out.print("What movie do tou want to rent?: ");
        String title = scanner.nextLine();

        for (Movie movie : movies) {
            if (movie.title.equalsIgnoreCase(title) && !movie.rented) {
                movie.rented = true;
                System.out.println("You have rented " + title);
                return;
            }
        }

        System.out.println("Movie not found or already rented. Try again.");
    }

    /**
     * Asks the user to input the title of the movie they want to rent.
     * @param newParam TODO
     */
    private void returnMovie(Object newParam) {
        System.out.print("Enter the title of the movie you want to return: ");
        String title = scanner.nextLine();

        for (Movie movie : movies) {
            if (movie.title.equalsIgnoreCase(title) && movie.rented) {
                movie.rented = false;
                System.out.println("Thank you for returning " + title);
                return;
            }
        }

        System.out.println("Movie not found or not rented. Please check and try again.");
    }
}

