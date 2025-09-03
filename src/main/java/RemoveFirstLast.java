import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {
        // 1. Create a LinkedList of String
        LinkedList<String> items = new LinkedList<>();

        // 2. Add some elements to the list
        items.add("Red");
        items.add("Green");
        items.add("Yellow");
        items.add("Pink");
        items.add("Orange");

        // Display the original list
        System.out.println("Original LinkedList: " + items);

        // 3. Remove the first element
        String firstRemoved = items.removeFirst();
        System.out.println("Removed first element: " + firstRemoved);

        // 4. Remove the last element
        String lastRemoved = items.removeLast();
        System.out.println("Removed last element: " + lastRemoved);

        // Display the modified list
        System.out.println("After removals: " + items);
    }

}
