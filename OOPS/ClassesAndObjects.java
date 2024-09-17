package OOPS;


class Vehical{

    String Brand;
    String Model;

    public void Make()
    {
        System.out.println(this.Brand+" "+this.Model+" In The Process of Manufacturing");
    }
}
public class ClassesAndObjects {

    public static void main(String[] args) {
        Vehical car1 = new Vehical();
        car1.Brand = "TOYOTA";
        car1.Model = "Supra";
        car1.Make();

        Vehical car2 = new Vehical();
        car2.Brand = "Porsche";
        car2.Model = "911";
        car2.Make();
    }
}
