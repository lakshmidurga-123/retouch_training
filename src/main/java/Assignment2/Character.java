package Assignment2;

public class Character {
    public static void main(String[] args) {
        char letter = 'A';

        int unicodeValue = (int) letter;
        System.out.println("Unicode of A: " + unicodeValue);
        char nextLetter = (char) (letter + 1);
        System.out.println("Next letter: " + nextLetter);
    }
}

