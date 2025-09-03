import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add a few elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 3. Check for presence of certain elements using contains()
        System.out.println("Does the list contain 'Banana'? " + fruits.contains("Banana"));  // Expected: true
        System.out.println("Does the list contain 'Grapes'? " + fruits.contains("Grapes"));  // Expected: false
    }

}
