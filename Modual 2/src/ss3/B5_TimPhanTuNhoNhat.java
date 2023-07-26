package ss3;

import java.util.Scanner;

public class B5_TimPhanTuNhoNhat {
    public class BaiTap5_TimGiaTriNhoNhatTrongMang {
        public static void main(String[] args) {
            final int SIZE = 5;
            int[] arr = new int[SIZE];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + SIZE + " integers:");
            for (int i = 0; i < SIZE; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = arr[0];
            for (int i = 1; i < SIZE; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("The minimum value in the array is: " + min);
        }
    }
}
