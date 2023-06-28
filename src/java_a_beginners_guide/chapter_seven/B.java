package java_a_beginners_guide.chapter_seven;

public class B extends A{
    //Instance field.
    private int variableI; //This variableI hides the variableI in A.

    public B(int variableA, int variableB) {
        super.variableI = variableA;
        this.variableI = variableB;
    }

    /**
     * Displaying the different values of variableI from class A and B.
     */
    public void showValues() {
        System.out.println("VariableI in A and variableI in B : " +
                super.variableI + " and " + this.variableI);
    }
}
