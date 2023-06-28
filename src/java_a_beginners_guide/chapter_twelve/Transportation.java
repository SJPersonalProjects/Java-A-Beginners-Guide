package java_a_beginners_guide.chapter_twelve;

public enum Transportation {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    //Typical variable of each transport.
    private final int speed;

    //Constructor.
    Transportation(int speed){
        this.speed = speed;
    }

    //Get the speed of each transport.
    public int getSpeed() {
        return speed;
    }
}
