package oops_with_java_2026_202501100600124.ExceptionHandling;

import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3};
        int i = sc.nextInt();
        try{
            System.out.println(arr[i]);
            int a = sc.nextInt();
            System.out.println(arr[i]/a);
        }catch(Exception e){
            System.out.println("Exception caught is "+ e);
        }
        finally{
            System.out.println("Finally Executed");
        }
    }
}
