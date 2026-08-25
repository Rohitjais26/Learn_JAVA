package OOPS;

public class Bag {
    String brandd;
    double salary;
    Book book;

    Bag(String brandd, double salary){
        this.brandd = brandd;
        this.salary = salary;
    }
    public void addBooks(int pages, String title){
        //Lazy
        book = new Book(pages, title);
    }
}
