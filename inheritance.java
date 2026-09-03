package oops_with_java_2026_202501100600124;
class Vehicle{
    private String name;
    private int speed;
    public void display(){
        System.out.println("Vehicle " + name + " " + "is moving at "+ speed + " "+ "km/h");
    }
    public void move(){
        System.out.println("Vehicle can move");
    }
    public Vehicle(String n, int s){
        name = n;
        speed = s;
    }
}

class Bike extends Vehicle{
    public void wheels(){
        System.out.println("Bike has 2 wheels");
    }
    public Bike(String name, int speed){
        super(name,speed);
    }
}

class Car extends Vehicle{
    public void wheels(){
        System.out.println("Car har 4 wheels");
    }
    public Car(String name, int speed){
        super(name,speed);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Vehicle obj1 = new Bike("Splendor", 60);
        //Upcasting;
        Vehicle obj2 = new Car("BMW", 200);
        Vehicle[] obj = {obj1,obj2};
        for(Vehicle i: obj){
            i.move();
            i.display();
        }
    }
}
