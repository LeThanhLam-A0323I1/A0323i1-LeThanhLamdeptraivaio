package ss4;

import java.util.Scanner;

public class B1_PTBac2 {
    double a, b, c;

    public B1_PTBac2() {

    }

    public B1_PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return c;
    }

    public double getB1_PTBac2() {
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = sc.nextDouble();

        B1_PTBac2 equation = new B1_PTBac2(a, b, c);

        if (equation.getB1_PTBac2() >= 0) {
            double x1 = (-b + Math.sqrt(equation.getB1_PTBac2())) / (2 * a);
            double x2 = (-b - Math.sqrt(equation.getB1_PTBac2())) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
