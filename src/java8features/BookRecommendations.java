package java8features;

import java.util.*;
import java.util.stream.Collectors;

public class BookRecommendations {

    // Book Class
    static class Book {
        private String title;
        private String author;
        private String genre;
        private double rating;

        public Book(String title, String author, String genre, double rating) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.rating = rating;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getGenre() { return genre; }
        public double getRating() { return rating; }
    }

    // BookRecommendation Class
    static class BookRecommendation {
        private String title;
        private double rating;

        public BookRecommendation(String title, double rating) {
            this.title = title;
            this.rating = rating;
        }

        public String getTitle() { return title; }
        public double getRating() { return rating; }

        @Override
        public String toString() {
            return "Title: " + title + " | Rating: " + rating;
        }
    }

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Frank Herbert", "Science Fiction", 4.8),
                new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.5),
                new Book("1984", "George Orwell", "Dystopian", 4.6),
                new Book("Neuromancer", "William Gibson", "Science Fiction", 4.2),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.7),
                new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.1),
                new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.6),
                new Book("The Martian", "Andy Weir", "Science Fiction", 4.4),
                new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.3),
                new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 4.5)
        );

        // 1️⃣ Filter: Science Fiction & rating > 4.0
        List<Book> filteredBooks = books.stream()
                .filter(b -> b.getGenre().equals("Science Fiction") && b.getRating() > 4.0)
                .collect(Collectors.toList());

        // 2️⃣ Transform to BookRecommendation
        List<BookRecommendation> recommendations = filteredBooks.stream()
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .collect(Collectors.toList());

        // 3️⃣ Sort by rating descending
        List<BookRecommendation> sortedBooks = recommendations.stream()
                .sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed())
                .collect(Collectors.toList());

        // 4️⃣ Pagination (Top 10 books, page size 5)
        int pageSize = 5;
        int totalBooks = Math.min(10, sortedBooks.size());

        System.out.println("Paginated Result (Top 10, 5 per page):");

        for (int i = 0; i < totalBooks; i += pageSize) {
            System.out.println("\nPage " + ((i / pageSize) + 1));
            sortedBooks.stream()
                    .skip(i)
                    .limit(pageSize)
                    .forEach(System.out::println);
        }
    }
}
