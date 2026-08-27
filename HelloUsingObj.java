package Learning_JAVA;

class Hello_World{
    void display(){
        System.out.println("Hello World");
    }
}

public class HelloUsingObj {
    public static void main(String[] args) {
        Hello_World obj1 = new Hello_World();
        obj1.display();
    }
}
