package ss5;


public class B1_Accessmodifier {
    private double radius;
    private String color;

    public B1_Accessmodifier(){
        radius = 1.0;
        color = "red";
    }
    public B1_Accessmodifier (double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getAre(){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        B1_Accessmodifier c1 = new B1_Accessmodifier();
        System.out.println("Radius of C1 is: " + c1.getRadius());
        System.out.println("Area of C1 is: " + c1.getAre());

        B1_Accessmodifier c2 = new B1_Accessmodifier(2.0);
        System.out.println("Radius of C1 is: " + c2.getRadius());
        System.out.println("Area of C1 is: " + c2.getAre());
    }
}
