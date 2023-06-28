package java_a_beginners_guide.chapter_six;

public class CallByValueTest {
    //This method causes no change to the arguments
    //used in the call.
    public void noChange(int i, int j) {
        //Values changed in here...
        i = i * j;
        j = -j;
    }
}
