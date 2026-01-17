public class Febonaci {
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        int result=fib(6-1)+fib(6-2);
        System.out.println("Fabonaci of " + n + " is: " + result);
    }
}
