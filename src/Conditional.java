import java.util.Scanner;
public class Conditional {
    static class Main {
        public static void main(String[] args) {
            int num = 7;

            if (num > 0) {
                System.out.println("Positive");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                if (n % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }

        }
    }



