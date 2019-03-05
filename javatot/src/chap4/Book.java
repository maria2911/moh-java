package chap4;

/**
discuss on "Static" keyword
* - apply to variable and method
* - shared 
* 
 */
public class Book {
    static int bil = 0; // shared by all object and own by class
    String title;
    
    public void info(){
        
    }
    
    public static void cetak(){
        System.out.println("Jumlah buku = " + Book.bil);
        
    }
    
    Book() // constructor
    {
        Book.bil = Book.bil + 1;
        System.out.println("bil buku = " + Book.bil); // sout + tab
        
    }
    
    // own by class book bukan obj book
    public static void main(String[] args) {
        Book b1 = new Book(); // obj
        Book b2 = new Book(); // obj
        Book.cetak();
        cetak(); // function station boleh panggil method static
        //info(); // error x boleh call method selain static
    }
    
}
