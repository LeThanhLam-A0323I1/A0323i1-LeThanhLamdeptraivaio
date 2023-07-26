package ss3;

import java.util.Scanner;

public class B6_TinhTongCacSoO1Cot {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number to sum: ");
        int column = scanner.nextInt();
        int sum = 0;
        for (int[] matrix1 : matrix) {
            sum += matrix1[column];
        }
        System.out.println("The sum of column " + column + " is: " + sum);
    }
}
