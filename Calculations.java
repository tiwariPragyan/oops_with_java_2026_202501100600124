package Learning_JAVA;

import java.util.Scanner;

class Operations{
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sub(int a,int b){
        System.out.println(a-b);
    }
    static void product(int a,int b){
        System.out.println(a*b);
    }
    static void divide(int a, int b){
        if(b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("Invalid");
        }
    }
}

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose operations to be performed:");
        System.out.println("1.Addition, 2.Subtration, 3.Product, 4.Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Operations.sum(a, b);
                break;
            case 2:
                Operations.sub(a, b);
                break;
            case 3:
                Operations.product(a, b);
                break;
            case 4:
                Operations.divide(a, b);
                break;
            default:
                System.out.println("Invalid Choice :(");
        }
    }
    
}
