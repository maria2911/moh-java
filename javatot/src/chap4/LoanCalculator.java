package chap4;
/*
this ==> guna utk set @get a property OR call / run a method
i.e : this.jumlah = 100;
*/

public class LoanCalculator extends Calculator {
    int jumlah; // variable @ property
    // ctrl + space = show auto sugesstion
    //psvm + tab = auto generate => public static void main(String[] args)
    public static void main(String[] args) { 
        LoanCalculator cal = new LoanCalculator();
        LoanCalculator cal2 = new LoanCalculator(1);
    }
    
    // constructor - tiada return apa2 dan nama mesti sama dgn class ie :LoanCalculator
    // dlm 1 class mesti ada multiple contructor
    // auto run bila create new object
    // biasanya guna utk initialize variable
    // mesti public kalu x letak public (public, protect dan private)
     public LoanCalculator(){
         super(); // run parent contructor
         System.out.println("i'm in constructor");   
       
    }
    
    //constructor
    public LoanCalculator(int amount){
        this.jumlah = amount; // initialize value awalan
        System.out.println("i'm in constructor ke 2");
        
    }
    
    // mesti return int, void no return
    int calcLoanPayment(int amount, int numberOfMonths, String state) {
// Your code goes here
        return 0;
    }
    // shift + alt + f = auto arrange code
    
    // method overlaoding
int calcLoanPayment (int amount){
    return 0;
}
}

