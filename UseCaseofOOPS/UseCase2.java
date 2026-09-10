package oops_with_java_2026_202501100600124.UseCaseofOOPS;

abstract class Shape{
    abstract double area();
    abstract void displayArea();
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }
    public double area(){
        return 3.14*r*r;
    }

    public void displayArea(){
        System.out.println("Area = " + 3.14*r*r);
    }
}

class Rectangle extends Shape{
    double l,b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }

    public double area(){
        return l*b;
    }

    public void displayArea(){
        System.out.println("Area = " + l*b);
    }
}


public class UseCase2 {
    public static void main(String[] args) {
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(5.0);
    shapes[1] = new Rectangle(4.0, 6.0);
    for (Shape s : shapes) {
    s.displayArea(); // must print correct area for each shape
    }
    }

}
