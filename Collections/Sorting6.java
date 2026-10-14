package oops_with_java_2026_202501100600124.Collections;
import java.util.*;
class Product implements Comparable<Product>{
    int ProductId;
    String ProductName;
    int price;

    Product(int id,String name,int price){
        ProductId = id;
        ProductName = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product p1){
        return this.price - p1.price;
    }

    @Override
    public String toString(){
        return "Price: "+this.price+" "+"Product Name: "+this.ProductName+"\n";
    }

}

public class Sorting6 {
    public static void main(String[] args) {
        ArrayList<Product> l = new ArrayList<>();
        l.add(new Product(1, "Laptop", 60000));
        l.add(new Product(2, "Mobile", 60000));
        l.add(new Product(3, "Tablet", 30000));
        l.add(new Product(4, "Mouse", 1000));

        l.sort(null);
        System.out.println(l);
    }
}
