package OOPS;

// SINGLE LEVEL INHERITANCE


//class Shape{
//    String color;
//}
//
//class Triangle extends Shape{
//
//
//    public void printInfo()
//    {
//        System.out.println("Triangle is of "+this.color+" color");
//    }
//}


// MULTI-LEVEL INHERITANCE

//class Shape{
//        String color;
//}
//
//class Triangle extends Shape{
//    public void area(int l ,int h)
//   {
//        System.out.println("My area is :"+ 0.5*l*h +" Jeez I need GYM :(");
//   }
//}

//class Equilateral extends Triangle{
//
//    public void display()
//    {
//        System.out.println("Hi.. am "+ this.color +" equilateral Triangle ^^");
//    }
//}

// HIERARCHICAL INHERITANCE

class Shape{
    String color;
}

class Triangle extends Shape{
    public void area(int l ,int h)
    {
        System.out.println("Hi..am " +this.color + " triangle and my area is:"+ 0.5*l*h +" ^^");
    }
}
class Circle extends Shape{

    public void area(int r)
    {
        System.out.println("Hi.. am "+ this.color +" circle and my area is:"+ 3.*r*r +" Jeez am so fat I need Gym :( ");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area(16,15);

//        Equilateral eq1 = new Equilateral();
//        eq1.color = "Blue";
//        eq1.display();
//        eq1.area(10,10);

        Circle c1 = new Circle();
        c1.color = "Green";
        c1.area(24);
    }
}
