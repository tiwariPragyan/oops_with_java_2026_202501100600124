package oops_with_java_2026_202501100600124.Collections;
import java.util.*;
class Student implements Comparable<Student>{
    int Rollno;
    String name;
    int marks;

    Student(int roll,String name, int marks){
        this.Rollno = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        return o.marks - this.marks;
    }

    @Override
    public String toString(){
        return "Rollno: "+this.Rollno+" Name: "+this.name+" Marks: "+this.marks+"\n";
    }



}

class CustomComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1.marks != o2.marks){
            return o2.marks - o1.marks;
        }
        return o1.Rollno-o2.Rollno;
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        if(o1.marks != o2.marks){
            return o2.marks - o1.marks;
        }
        return o1.name.compareTo(o2.name);
    }
}
public class SortingDemo {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(23);
        l.add(11);
        l.add(19);
        l.add(30);
        l.add(5);
        l.add(90);
        l.add(89);

        l.sort(null); //Ascending order;
        System.out.println(l);

        l.sort(Collections.reverseOrder()); // Descending order;
        System.out.println(l);

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student(1, "Aryan", 30));
        st.add(new Student(4, "Rohan", 50));
        st.add(new Student(3, "Sohan", 50));
        st.add(new Student(7, "Mohan", 20));
        st.add(new Student(5, "Karan", 10));
        st.add(new Student(9, "Ramesh", 60));

        st.sort(null);
        System.out.println(st);
        st.sort(new CustomComparator());
        System.out.println(st);
        st.sort(new NameComparator());
        System.out.println(st);
        
    }
}