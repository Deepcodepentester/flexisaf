import java.util.ArrayList;
public class Book {
    public String title;
    public String author;
    public String ISBN;
    public static void addBook(ArrayList<Book> books,Book book){
        books.add(book);
    }
    public static void removeBook(ArrayList<Book> books,Book book){
        
        books.remove(book);
    }
    public static ArrayList<Book> books ;
    public Book(String title,String author,String ISBN){
        this.title = title;
        this.author= author;
        this.ISBN= ISBN;
    }
    public static void main(String[] args) {
        Book.books= new ArrayList<>();
        System.out.println("hello world");
        Book book1= new Book("first","chidera","0001");
        Book book2= new Book("second","nebo","0002");
        Book book3= new Book("third","collins","0003");
        //The collection is empty
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections "  +Book.books);
        Book.addBook(Book.books,book1);
        //The collection after adding one Book
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections"  +Book.books);
        Book.addBook(books,book2);
        //The collection after adding two Book
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections"  +Book.books);
        Book.addBook(books,book3);
        //The collection after adding three Book
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections"  +Book.books);
        Book.removeBook(books,book3);
        //The collection after removing a Book
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections"  +Book.books);
        Book.removeBook(books,book2);
        //The collection after removing another Book
        System.out.println("The book collection with "+String.valueOf(Book.books.size())+ " collections"  +Book.books);
    }
    // Class body: fields (attributes), constructors, and methods (behaviors) go here

}
