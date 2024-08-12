package divi;

public class arrind {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array with 5 elements

        try {
            // Attempt to access an invalid index
            System.out.println("Element at index 10: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
