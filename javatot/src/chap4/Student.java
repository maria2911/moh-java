package chap4;

// pass variable by value VS by reference
// primitive + string = passing by value
public class Student {
    // contructor x wajib
    void SetName (String name) {
        name = name + " bin Arshad";
        System.out.println("name");
        
    }
    
    void changeBookTitle(Book b) {
    b.title = "Java Advanced";
}
    // dlm main
    public static void main(String[] args) {
        Student s1 = new Student(); // obj
        String nama = "maria";
        s1.SetName(nama);
        System.out.println("nama");
       
        // passing by reference
        Book b1 = new Book();
        b1.title = "Java for beginer";
        System.out.println("b1.title");
        s1.changeBookTitle(b1);
        System.out.println("b1.title");
    }
}
