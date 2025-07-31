package Assignment2;

public class Relational {
    public static void main(String[] args) {
        int age = 20;
        int score = 75;
        int passMark = 50;

        boolean didPass = score >= passMark;
        System.out.println("Did the student pass? " + didPass);
        boolean isAdultAndPassed = (age >= 18) && didPass;
        System.out.println("Is the student an adult and passed? " + isAdultAndPassed);

    }
}

