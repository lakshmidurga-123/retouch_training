package Assignment2;

public class TypeCasting1 {
    public static void main(String[] args) {
        double x = 22.7;
        int y = 4;
        int modResult = (int) x % y;
        double addResult = x + (double) y;
        boolean isEqual = (int) x == y * 5;
        boolean isConditionTrue = x > 20 && y < 10;


        System.out.println("(int)x % y: " + modResult);
        System.out.println("x +(double)y: " + addResult);
        System.out.println("Is(int)x equal to y * 5? " + isEqual);
        System.out.println("Is x > 20 and y < 10? " + isConditionTrue);

    }
}
