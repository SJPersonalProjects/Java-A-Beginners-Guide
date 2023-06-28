package java_a_beginners_guide.chapter_eight;

public interface MyIF {
    /**
     * Method to get the user-ID.
     * @return userID.
     */
    int getUserID();

    /**
     * A default method to get the admin-ID.
     * @return adminID.
     */
    default int getAdminID() {
        return 1;
    }
}
