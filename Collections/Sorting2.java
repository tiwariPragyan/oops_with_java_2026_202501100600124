import java.util.*;
class Product{
    int ProductId;
    String ProductName;
    int price;

    Product(int id,String name,int price){
        ProductId = id;
        ProductName = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Price: "+this.price+" "+"Product Name: "+this.ProductName+"\n";
    }

}

class CustomComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2){
        if(p1.price != p2.price){
            return p2.price - p1.price;
        }
        return p2.ProductName.compareTo(p1.ProductName);
    }
}

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Product> l = new ArrayList<>();
        l.add(new Product(1, "Laptop", 60000));
        l.add(new Product(2, "Mobile", 60000));
        l.add(new Product(3, "Tablet", 30000));
        l.add(new Product(4, "Mouse", 1000));

        l.sort(new CustomComparator());
        System.out.println(l);
    }
}
