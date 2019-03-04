package chap4;
/*
this ==> guna utk set @get a property OR call / run a method
i.e : this.jumlah = 100;
*/

public class LoanCalculator extends Calculator {
     int jumlah; // variable @ property
     // value in ix boleh tukar
     final String tajuk = "LOAN CALCULATOR";
    
    // ===================================================
    // ini error sebab averrite annition
    // ini x boleh sebab parent info() dah final
    //    public void info(){        
    //    }
    // ====================================================
    // ini overrite cetak dlm parent
    
    @Override
    public void cetak(){
        //this.tajuk ="abcc"; // errror x boleh tukar
        System.out.println("Cetak LoanCalculator ");
    }
   
    // ctrl + space = show auto sugesstion
    //psvm + tab = auto generate => public static void main(String[] args)
    public static void main(String[] args) { 
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
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

