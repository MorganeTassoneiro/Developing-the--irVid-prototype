import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    String title;
    boolean rented;

    Movie(String title) {
        this.title = title;
        this.rented = false;
    }
}

public class MovieRentalLogin {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    private static void displayMenu() {
        System.out.println("Movie Rental Prototype");
        System.out.println("1. Display available movies");
        System.out.println("2. Rent a movie");
        System.out.println("3. Return a movie");
        System.out.println("4. Exit");
    }

    private static void displayMovies() {
        System.out.println("Available Movies:");
        for (Movie movie : movies) {
            if (!movie.rented) {
                System.out.println(movie.title);
            }
        }
    }

    private static void rentMovie() {
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

    private static void returnMovie() {
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
