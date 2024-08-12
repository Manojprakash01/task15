package divi;

public class StrInd {
	public static void main(String[] args) {
        String text = "Hello, world!"; // String with 13 characters

        try {
            // Attempt to access an invalid index
            char character = text.charAt(20);
            System.out.println("Character at index 20: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: String index is out of bounds.");
        }
    }
}
