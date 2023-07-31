package ss7.B1Colorable;

import ss7.B1Colorable.Square;

public class test {
    public static void main(String[] args) {
        Square square = new Square("red", true, 30);
        System.out.println(square.toString());
        square.howToColor();
    }
}
