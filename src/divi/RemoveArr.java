package divi;
import java.util.ArrayList;
public class RemoveArr {
	public static void main(String[] args) {
        // Step 1: Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Print the ArrayList before removing elements
        System.out.println("ArrayList before removal: " + list);

        // Step 2: Remove all elements using clear()
        list.clear();

        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removal: " + list);
    }
}
