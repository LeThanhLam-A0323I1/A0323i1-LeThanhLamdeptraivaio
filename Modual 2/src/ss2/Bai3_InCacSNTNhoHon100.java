package ss2;

import java.util.Scanner;

public class Bai3_InCacSNTNhoHon100 {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố nhỏ hơn: ");
        int n = scanner.nextInt();
        for(int i = 2; i < n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
