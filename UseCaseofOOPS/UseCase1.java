package oops_with_java_2026_202501100600124.UseCaseofOOPS;

class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;
    final static String libraryName = "Sunrise Public Library";
    static int bookCount = 0;
    Book(String title,String author, double price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        bookCount++;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getISBN(){
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }



}


public class UseCase1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
    }
}
