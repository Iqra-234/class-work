public class Array {
    static  class Main {
        public static void main(String[] args) {
            int[] marks = {85, 90, 78, 92, 88};
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }

            double average = (double) sum / marks.length;
            System.out.println("Average Marks = " + average);

            int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        System.out.println("Maximum = " + max);
    }
    }
}
