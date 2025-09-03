package Assignment2;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        // 1. Create a LinkedList of String
        LinkedList<String> names = new LinkedList<>();

        // 2. Add 5 names to the list
        names.add("Lakshmi");
        names.add("Chanti");
        names.add("Vishnu");
        names.add("Priya");
        names.add("Hema");

        // 3. Retrieve the 3rd element (index 2)
        String third = names.get(2);
        System.out.println("The 3rd element is: " + third);
    }

}
