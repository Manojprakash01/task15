package divi;
import java.util.ArrayList;
import java.util.List;

public class ListofArray {

	public static void main(String[] args) {
        // Step 1: Create a List and add some elements
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Step 2: Convert List to Array
        // Using toArray(T[] a) method
        String[] stringArray = stringList.toArray(new String[0]);

        // Step 3: Print the Array elements
        System.out.println("Array elements:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }
    }
}
