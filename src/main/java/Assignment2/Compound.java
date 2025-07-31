package Assignment2;

public class Compound {
    public static void main(String[] args) {
        int x = 17;
        int y = 5;

        x += y;  // Add y to x
        System.out.println("After addition: " + x);

        x *= 2;  // Multiply x by 2
        System.out.println("After multiplication: " + x);

        x %= y;  // x = x % y
        System.out.println("Remainder: " + x);
    }
}


