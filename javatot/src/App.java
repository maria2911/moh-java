// main() function berada di dlm 1 class kusus yg akan guna class-class yg lain
public class App {
    // entry point method (pintu masuk)
    public static void main(String[] args){
        // create object
        Car ferrari = new Car();
        ferrari.numberOfDoors = 2;
        ferrari.startEngine();
        ferrari.color ="red"; // mesti "" klu string,  x boleh '' single code
        // ' ' hanya utk character shj
        ferrari.print();
        
        Car porsche = new Car();
        
        
    }
    
}
