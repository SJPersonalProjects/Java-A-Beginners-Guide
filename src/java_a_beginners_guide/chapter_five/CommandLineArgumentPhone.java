package java_a_beginners_guide.chapter_five;

public class CommandLineArgumentPhone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Sarim", "00000000001"},
                {"Rafique", "00000000002"},
                {"Wamique", "00000000003"}
        };

        int i;

        if(args.length != 1) {
            System.out.println("Usage: Java Phone <name>");
        }else {
            for(i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length) {
                System.out.println("Name not found.");
            }
        }
    }
}
