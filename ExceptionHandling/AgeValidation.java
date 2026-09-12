package oops_with_java_2026_202501100600124.ExceptionHandling;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int a = sc.nextInt();
        try{
            checkAge(a);
        }catch(AgeInvalidException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
    static void checkAge(int age) throws AgeInvalidException{
        if(age < 18) 
            throw new AgeInvalidException("Age  is not valid to vote");
        else 
            System.out.println("Eligible to vote");
    }
}

class AgeInvalidException extends Exception{
    AgeInvalidException(String msg){
        super(msg);
    }
}