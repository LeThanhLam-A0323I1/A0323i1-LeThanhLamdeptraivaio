package ss3;

import java.util.Arrays;

public class B3_GopMang {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        int [] numbres2 = {1,2,3,4,5,6,7,8};
        int [] newwnumbres =  new int[numbers.length + numbres2.length];
        int index = 0 ;
        for (int i = 0; i <numbers.length; i++ ){
            newwnumbres[index] = numbers[i];
            index ++;
        }
        for (int i = 0; i < numbres2.length; i++ ){
            newwnumbres[index] = numbers[i];
            index ++;
        }
        System.out.println("mảng sau khi gộp");
        System.out.println(Arrays.toString(newwnumbres));
    }
}
