package OOPS;

class Employee{
    String name;
    static String University;    // har student ka same school hai

    public void printInfo()
    {
        System.out.println(this.name);
    }
}
public class Static {
    public static void main(String[] args) {
        Employee.University = "Chitkara University";
        Employee e1 = new Employee();
        e1.name = "Rudransh";
        e1.printInfo();
        System.out.println("Employee at "+e1.University);

        // static mtlb VIP pehle preference static ko milegi

        // Static preference order --->> static variable --->> static block {} --->> static method/function
    }
}
