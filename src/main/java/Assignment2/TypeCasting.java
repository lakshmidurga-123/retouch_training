package Assignment2;

public class TypeCasting {
    public static void main(String[] args){
        int a=9;
        double b=4.0;
        double sum = (double) a + b;
        double division = a / b;
        boolean isGreater = a>(int)b;
        boolean condition = (a%3 == 0) && (b>2.5);


        System.out.println("Sum (a+b): " + sum);
        System.out.println("Division (a/b): " +division);
        System.out.println("Is a > (int)b? " + isGreater);
        System.out.println("Is a divisible by 3 and b > 2.5? " + condition);

    }
}
