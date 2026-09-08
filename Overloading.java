package oops_with_java_2026_202501100600124;

class Addition{
    void sum(){
        System.out.println("Addition");
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    static void sum(double a,int b){
        System.out.println(a+b);
    }
}

public class Overloading{
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        obj1.sum();
        obj1.sum(4,56);
        obj1.sum(4.2,5.6);
        Addition.sum(4.66,8);
    }
}