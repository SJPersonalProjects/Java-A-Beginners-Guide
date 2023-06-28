package java_a_beginners_guide.chapter_twelve;

public class EnumerationDemonstration {
    public static void main(String[] args) {
        //Declaring enumeration reference variable.
        Transport transport;

        //Assigning a value to enumeration variable.
        transport = Transport.AIRPLANE;

        //Output the value on the screen.
        System.out.println("Value of transport: " + transport);
        System.out.println();

        transport = Transport.TRAIN;

        //Compare two enum values.
        if(transport == Transport.TRAIN) {
            System.out.println("transport variable contains TRAIN");
        }

        //Use an enum to control a switch statement.
        switch(transport) {
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries Freight");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies");
                break;
            case TRAIN:
                System.out.println("A train runs on rails");
                break;
            case BOAT:
                System.out.println("A boat sails on water");
                break;
        }
    }
}
