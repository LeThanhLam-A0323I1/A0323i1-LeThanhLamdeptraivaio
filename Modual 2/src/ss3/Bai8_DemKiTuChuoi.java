package ss3;

public class Bai8_DemKiTuChuoi {
    public static void main(String[] args) {
        String a = "Hello Work";
        char b = 'l';

        int cout = 0;
        for (int i = 0; i < a.length(); i++ ){
            if (a.charAt(i) == b ){
                cout++;

            }
        }
        System.out.println("Số lần kí tự " + b + " xuât hiện trong chuỗi là : " + cout);
    }
}
