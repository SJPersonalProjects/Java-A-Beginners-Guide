package java_a_beginners_guide.chapter_eight.bookpack;

public class Book {
    //Instance fields.
    protected String mTitle;
    protected String mAuthor;
    protected int mPublishDate;

    /**
     * Parameterized constructor to initialize the object of Book.
     * @param mTitle of the book
     * @param mAuthor of the book
     * @param mPublishDate of the book
     */
    public Book(String mTitle, String mAuthor, int mPublishDate) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublishDate = mPublishDate;
    }

    /**
     * Method to display the details of a book to the user.
     */
    public void showBook() {
        System.out.println("Title: " + mTitle +
                "\nAuthor: " + mAuthor +
                "\nPublish Date: " + mPublishDate);
        System.out.println(); //For a gap of line.
    }
}
