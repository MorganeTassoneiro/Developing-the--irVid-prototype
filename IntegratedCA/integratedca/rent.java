package integratedca;
 import csv;

public class rent<with> {
   


    def __init__(self, movie_file):
        self.movies = self.load_movies(movie_file)
        self.rented_movies = {}

    def load_movies(self, movie_file):
        movies = {}
        /**
         * @return
         */
        with open(movie_file, 'r') as file:
            reader = csv.reader(file)
            for row in reader:
                title, price = row
                movies[title] = float(price)
        return movies

    def display_available_movies(self):
        print("Available Movies:")
        for title, price in self.movies.items():
            print(f"{title} - ${price:.2f}")

    def rent_movie(self, title):
        if title in self.movies:
            price = self.movies[title]
            self.rented_movies[title] = price
            del self.movies[title]
            print(f"You have rented {title} for ${price:.2f}")
        else:
            print(f"{title} is not available for rent.")

    def display_rented_movies(self):
        print("Rented Movies:")
        for title, price in self.rented_movies.items():
            print(f"{title} - ${price:.2f}")

    def return_movie(self, title):
        if title in self.rented_movies:
            price = self.rented_movies[title]
            self.movies[title] = price
            del self.rented_movies[title]
            print(f"You have returned {title}. Thank you!")
        else:
            print(f"{title} was not rented from this store.")

def main():
    movie_file = "movies.csv"  # Replace with your CSV file name
    rental_system = MovieRentalSystem(movie_file)

    while True:
        print("\n1. Display Available Movies")
        print("2. Rent a Movie")
        print("3. Display Rented Movies")
        print("4. Return a Movie")
        print("5. Exit")

        choice = input("Enter your choice (1-5): ")

        if choice == '1':
            rental_system.display_available_movies()
        elif choice == '2':
            title = input("Enter the title of the movie you want to rent: ")
            rental_system.rent_movie(title)
        elif choice == '3':
            rental_system.display_rented_movies()
        elif choice == '4':
            title = input("Enter the title of the movie you want to return: ")
            rental_system.return_movie(title)
        elif choice == '5':
            print("Exiting the Movie Rental System. Thank you!")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 5.")

if __name__ == "__main__":
    main()

    
}
