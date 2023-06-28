package java_a_beginners_guide.chapter_eight.bookpackext;

import java_a_beginners_guide.chapter_eight.bookpack.Book;

public class ExtBook extends Book {
    //Instance field.
    private String mPublisher;

    /**
     * Parameterized constructor to initialize the object of ExtBook
     * @param mTitle of the book
     * @param mAuthor of the book
     * @param mPublishDate of the book
     * @param mPublisher of the book
     */
    public ExtBook(String mTitle, String mAuthor, int mPublishDate, String mPublisher) {
        super(mTitle, mAuthor, mPublishDate);
        this.mPublisher = mPublisher;
    }

    public void setPublisher(String mPublisher) {
        this.mPublisher = mPublisher;
    }
    public String getPublisher() {
        return mPublisher;
    }

    /**
     * These are OKAY because subclasses can have access to the protected members.
     *
     * Method to set the title of the book
     * @param mTitle: title of the book.
     */
    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    /**
     * Method to get the title of the book.
     * @return mTitle: book title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Method to set the author name of the book.
     * @param mAuthor: author of the book.
     */
    public void setAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    /**
     * Method to get the author name of the book.
     * @return mAuthor: author name.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Method to set the publishing date of the book.
     * @param mPublishDate: publishing date of the book.
     */
    public void setPublishDate(int mPublishDate) {
        this.mPublishDate = mPublishDate;
    }

    /**
     * Method to get the publishing date of the book.
     * @return mPublishDate: publishing date of the book.
     */
    public int getPublishDate() {
        return mPublishDate;
    }
}
