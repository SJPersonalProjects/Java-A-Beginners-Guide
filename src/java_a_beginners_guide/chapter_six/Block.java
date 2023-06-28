package java_a_beginners_guide.chapter_six;

public class Block {
    private int a, b, c;
    private int volume;

    /**
     * Constructor to initialize a block object.
     * @param a: a is a side of a block.
     * @param b: b is a side of a block.
     * @param c: c is a side of a block to build it 3D.
     */
    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c; //Volume of a 3D block.
    }

    /**
     * This function checks if two blocks are same in dimensions.
     * @param object: object passed to compare with another object.
     * @return boolean expression based on the results of comparison.
     */
    public boolean isSameBlock(Block object) {
        if((object.a == a) && (object.b == b) && (object.c == c)) return true;
        else return false;
    }

    /**
     * Returns true if the objects have same volume.
     * @param object: object passed to compare with another object.
     * @return boolean expression based on the objects results of volume.
     */
    public boolean isSameVolume(Block object) {
        if(object.volume == volume) return true;
        else return false;
    }
}
