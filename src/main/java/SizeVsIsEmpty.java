import java.util.ArrayList;

public class SizeVsIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Initially, the list is empty
        System.out.println("list.size(): " + list.size());       // outputs: 0
        System.out.println("list.isEmpty(): " + list.isEmpty()); // outputs: true

        // Add an element
        list.add("Hello");

        System.out.println("After adding one element:");
        System.out.println("list.size(): " + list.size());       // outputs: 1
        System.out.println("list.isEmpty(): " + list.isEmpty()); // outputs: false

        // Add more elements
        list.add("World");
        list.add("!");

        System.out.println("After adding three elements:");
        System.out.println("list.size(): " + list.size());       // outputs: 3
        System.out.println("list.isEmpty(): " + list.isEmpty()); // outputs: false
    }

}
