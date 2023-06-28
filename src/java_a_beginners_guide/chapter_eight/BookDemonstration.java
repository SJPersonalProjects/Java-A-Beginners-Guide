package java_a_beginners_guide.chapter_eight;

public class BookDemonstration {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        //1D array of type book to keep the book on each index.
        books[0] = new Book("Java: A Beginner's Guide",
                "Schildt", 2019);
        books[1] = new Book("Java: The Complete Reference",
                "Schildt", 2019);
        books[2] = new Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book("On The Road",
                "Kerouac", 1955);

        //Using for loop to traverse through the list and display the data of each book.
        for(int i = 0; i < books.length; i++) {
            books[i].showBook();
        }
    }
}
