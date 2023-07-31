package ss5;

public class b2_Studen {
    private String name;
    private String classes;

    public b2_Studen(){
        name = "John";
        classes = "C02";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

    public static void main(String[] args) {
        b2_Studen student = new b2_Studen();
        student.setName("Lam Du");
        student.setClasses("A03");
    }
}
