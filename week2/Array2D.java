public class Array2D {
    static  class Main {
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("Transpose:");
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++)
                    System.out.print(mat[j][i] + " ");
                System.out.println();
            }
            int sum = 0;
            for (int i = 0; i < mat.length; i++)
                for (int j = 0; j < mat[i].length; j++)
                    sum += mat[i][j];
            System.out.println("Sum = " + sum);

            System.out.print("Main Diagonal: ");
            for (int i = 0; i < mat.length; i++)
                System.out.print(mat[i][i] + " ");
        }
    }

}
