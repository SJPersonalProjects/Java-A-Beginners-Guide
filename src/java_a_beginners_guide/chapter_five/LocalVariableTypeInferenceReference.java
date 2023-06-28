package java_a_beginners_guide.chapter_five;

public class LocalVariableTypeInferenceReference {
    //Instance variable.
    private int personAge;

    LocalVariableTypeInferenceReference(int personAge) {
        this.personAge = personAge;
    }

    /**
     * This method returns the person's age based on the passed value.
     * @return person's age.
     */
    public int getPersonAge() {
        return personAge;
    }

    /**
     * This method sets the person's age.
     * @param personAge age of the person in the database.
     */
    public void setPersonAge(int personAge) {
        if(personAge >= 0) {
            this.personAge = personAge;
        }
    }
}
