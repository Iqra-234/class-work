public class Factorial{

    public static int factorial(int n) {
        if (n == 1) return 1;   //base case
        return n * factorial(n - 1);  // recursive case
    }

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);   // method call

        System.out.println("Factorial of " + num + " is: " + result);
    }
}
