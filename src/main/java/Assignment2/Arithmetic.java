package Assignment2;

public class Arithmetic {
    public static void main(String[] args) {
        double x = 7.0;
        int y = 2;

        double resultWithoutCasting = x / y;
        System.out.println("Division result without casting: " + resultWithoutCasting);
        double resultWithCasting = x / (double) y;
        System.out.println("Division result with casting: " + resultWithCasting);
    }
}



