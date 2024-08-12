package divi;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Empmap {

	public static void main(String[] args) {
        // Step 1: Create a TreeMap and add employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(1001, "Alice Johnson");
        employeeMap.put(1002, "Bob Smith");
        employeeMap.put(1003, "Carol White");
        employeeMap.put(1004, "David Brown");
        employeeMap.put(1005, "Eva Green");

        // Step 2: Extract names and sort them alphabetically
        // Get the values (names) from the TreeMap
        ArrayList<String> employeeNames = new ArrayList<>(employeeMap.values());

        // Sort the names in alphabetical order
        Collections.sort(employeeNames);

        // Step 3: Print the names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}
