package oops_with_java_2026_202501100600124;
class Shape{
    void area(){}
}

class Circle extends Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    void area(){
        System.out.println("Area of circle is " + (3.14*r*r));
    }
}

class Rectangle extends Shape{
    private int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        System.out.println("Area of rectangle is "+ (l*b));
    }
}

public class Overriding {

    public static void main(String[] args) {
        Shape obj1 = new Circle(10.00);
        obj1.area();
        Shape obj2 = new Rectangle(10, 15);
        obj2.area();
        Circle obj3 = new Circle(5.9);
        obj3.area();
        Shape[] obj = {obj1,obj2,obj3};
        for(Shape i: obj){
            i.area();
        }
    }
}