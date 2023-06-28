package java_a_beginners_guide.chapter_twelve;

public class TrafficLightDemonstration {
    public static void main(String[] args) {
        TrafficLightSimulator trafficLightSimulator =
                        new TrafficLightSimulator(TrafficLightColor.GREEN);

        Thread thread = new Thread(trafficLightSimulator);
        thread.start();

        for(int i = 0; i < 9; i++) {
            System.out.println(trafficLightSimulator.getColor());
            trafficLightSimulator.waitForChange();
        }

        trafficLightSimulator.cancel();
    }
}
