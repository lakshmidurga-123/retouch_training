import java.util.*;
import java.util.Scanner;

public class FinallyClass {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=5;
            int result=a/b;
            System.out.println("Result:" +result);
        }
        catch (Exception e){
            System.out.println("Exception occurred!!!");
        }
        finally {
            System.out.println("Program continues!!!");
        }
    }

}
