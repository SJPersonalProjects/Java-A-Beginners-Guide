package java_a_beginners_guide.chapter_fourteen;

public class LambdaArgumentDemonstration {
    /**
     * This method has a functional interface as the type of its first parameter.
     * Thus, it can be passed a reference to any instance of that interface, including
     * an instance created by a lambda expression. The second parameter specifies the
     * String to operate on.
     */
    static String changeString(StringFunction stringFunction, String string) {
        return stringFunction.function(string);
    }

    public static void main(String[] args) {
        String inString = "Lambda Expressions Expand Java";
        String outString;

        System.out.println("Here is input string: " + inString);

        //Define a block lambda that reverses the contents of a string
        //and assign it to a StringFunction reference variable.
        StringFunction stringFunction = (string) -> {
            String result = "";

            //Using for loop to iterate in descending order to reverse the String.
            for(int i = string.length() - 1; i >= 0; i--) {
                result += string.charAt(i);
            }
            return result;
        };

        //Pass reverse to the first argument to changeString().
        //Pass the input string as a second argument.
        outString = changeString(stringFunction, inString);
        System.out.println("The String reversed: " + outString);

        //This lambda expression replaces spaces with hyphens.
        //It is embedded directly in the call to changeString().
        outString = changeString((string) -> string.replace(' ', '-'), inString);
        System.out.println("The string with spaces replaced: " + outString);

        //This block lambda inverts the case of the characters in the String.
        //It is also embedded directly in the call to changeString().
        outString = changeString((string) -> {
            String result = "";
            char character;

            for(int i = 0; i < string.length(); i++) {
                character = string.charAt(i);
                if(Character.isUpperCase(character)) {
                    result += Character.toLowerCase(character);
                }else {
                    result += Character.toUpperCase(character);
                }
            }

            return result;
        }, inString);

        System.out.println("The string is reversed case: " + outString);
    }
}
