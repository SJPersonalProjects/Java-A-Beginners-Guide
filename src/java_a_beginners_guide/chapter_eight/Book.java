package java_a_beginners_guide.chapter_eight;

public class Book {
    //Instance fields.
    private String mTitle;
    private String mAuthor;
    private int mPublishDate;

    /**
     * Parameterized constructor to initialize the Book object.
     * @param mTitle: title of the book.
     * @param mAuthor: author of the book.
     * @param mPublishDate: publishing date of the book.
     */
    public Book(String mTitle, String mAuthor, int mPublishDate) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublishDate = mPublishDate;
    }

    /**
     * Method to set the title of the book.
     * @param mTitle of the book.
     */
    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    /**
     * Method to get the title of the book.
     * @return book title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Method to set the author name of the book.
     * @param mAuthor of the book.
     */
    public void setAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    /**
     * Method to get the author of the book.
     * @return mAuthor of the book.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Method to set the publishing date of the book.
     * @param mPublishDate of the book.
     */
    public void setPublishDate(int mPublishDate) {
        this.mPublishDate = mPublishDate;
    }

    /**
     * Method to get the publishing date of the book.
     * @return mPublishDate of the book.
     */
    public int getPublishDate() {
        return mPublishDate;
    }

    /**
     * Method to display the book details as console output.
     */
    public void showBook() {
        System.out.println("Book Title: " + mTitle +
                "\nBook Author: " + mAuthor +
                "\nPublish Date: " + mPublishDate);
        System.out.println(); // for a gap of line.
    }
}
