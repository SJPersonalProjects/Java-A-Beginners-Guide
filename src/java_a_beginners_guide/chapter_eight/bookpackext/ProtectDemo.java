package java_a_beginners_guide.chapter_eight.bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] extBooks = new ExtBook[5];

        //Storing the books in the shelf of ExtBook objects.
        extBooks[0] = new ExtBook("Java: A Beginner's Guide", "Schildt",
                2019, "Oracle Press");
        extBooks[1] = new ExtBook("Java: The Complete Reference", "Schildt",
                2019, "Oracle Press");
        extBooks[2] = new ExtBook("Introducing JavaFX 8 Programming", "Schildt",
                2015, "Oracle Press");
        extBooks[3] = new ExtBook("Red Storm Rising", "Clancy",
                1986, "Putnam");
        extBooks[4] = new ExtBook("On The Road", "Kerouac",
                1955, "Viking");

        //Find books by authors.
        System.out.println("Show all books by Schildt.");
        for(int i = 0; i < extBooks.length; i++) {
            if(extBooks[i].getAuthor().equalsIgnoreCase("Schildt")) {
                System.out.println(extBooks[i].getTitle());
            }
        }
    }
}
