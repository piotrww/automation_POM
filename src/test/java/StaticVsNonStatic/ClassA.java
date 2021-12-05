package StaticVsNonStatic;

public class ClassA {


    private static int mySum;
    private static int myMultiplyOutput;

    //Static method
    public static void sum(int a, int b) {
      int mySum = a + b;
      System.out.println(mySum);
    }

    public void multiply(int a, int b) {
        int myMultiplyOutput = a + b;
        System.out.println(myMultiplyOutput);
    }


}
