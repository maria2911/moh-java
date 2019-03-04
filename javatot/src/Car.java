// nama file dan nama class mesti sama
// class name guna camel case ie: NamaSaya
// 1 class berada didalam 1 file
public class Car {
    String color;
    int numberOfDoors; 
    
    void print(){
        System.out.println("Color:" + this.color);
    }
    
    void startEngine(){
        System.out.println("Vroom..Vroom...."); // taip sout tab nak cepat
    }
    
    void stopEngine(){
        int tempCounter = 0;
    }
}
