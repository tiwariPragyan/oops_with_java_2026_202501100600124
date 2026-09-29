package oops_with_java_2026_202501100600124.UseCaseofOOPS;

import java.util.*;
public class UseCase6 {

    public static void addMarks(List<Integer> marks, int mark) {
        
    }

    public static double calculateAverage(List<Integer> marks) {
        double sum = 0.0;
        for(int i:marks){
            sum+=i;
        }
        return sum/marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        int max = marks.get();
        
    }

    public static void displayMarks(List<Integer> marks) {
        // Write your code
    }

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}
