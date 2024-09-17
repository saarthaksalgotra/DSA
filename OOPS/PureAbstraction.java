package OOPS;

interface Car
{
    int tyres = 4;
     void start();
}

class Toyota implements Car {
    public void start()
    {
        System.out.println("car starting.......");
    }
}
public class PureAbstraction {
    public static void main(String[] args) {
        Toyota supra = new Toyota();
        supra.start();
        System.out.println("Supra has " +Car.tyres+ " tyres");
    }
}
