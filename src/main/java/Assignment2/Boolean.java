package Assignment2;

public class Boolean {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isChallenging = true;

        boolean funButNotChallenging = isJavaFun && !isChallenging;
        System.out.println("Is Java fun but not challenging? " + funButNotChallenging);
        boolean eitherTrue = isJavaFun || isChallenging;
        System.out.println("Is either statement true? " + eitherTrue);
    }
}


