package oops_with_java_2026_202501100600124.ExceptionHandling;

import java.io.FileReader;
import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3};
        int i = sc.nextInt();
        try{
            FileReader fr = new FileReader("abc.txt");
            System.out.println(arr[i]);
            int a = sc.nextInt();
            System.out.println(arr[i]/a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught is "+ e.getMessage());
        }
        catch(Exception e){  // Exception is parent class of all exceptions. It can handle all type  of exceptions
            System.out.println("Exception caught is "+ e.getMessage());
        }
        finally{
            System.out.println("Finally Executed");
        }
    }
}
