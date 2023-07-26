package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class B2_ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần chèn phần tử ");
        int a = scanner.nextInt();
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        if (a<0 || a > numbers.length){
            System.out.println("không thể chèn phần tử");
        }
        else {
            int[] newNumber = new int[numbers.length + 1];
            for (int i = 0, j = 0; i < newNumber.length-1; i++){
                if (a == i){
                    newNumber[i] = x;
                }
                else {
                    newNumber[i] = numbers[j];
                    j++;
                }

            }
            System.out.println("Mảng sau khi được chèn thêm một phần tử ");
            System.out.println(Arrays.toString(newNumber));
        }

    }
}
