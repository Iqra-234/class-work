import java.util.Scanner;
public class Loop {
    static class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("Print 1 to 10");
            for(int i=1 ;i<=10;i++){
                System.out.println("Numbers: " + i);
            }
        }

    }
}
