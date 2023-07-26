package ss2;

import java.util.Scanner;

public class Bai2_20SoNguyenToDauTien {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số lượng các số nguyên tố cần in: ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
