package chap5;


public class Array {
    public static void main(String[] args) {
        //people = []
        //
        String[] people = new String[3];
        people[0] = "abu";
        people[1] = "Abi";
        people[2] = "Abam";
       // people[3] = "Along";// error
        
        System.out.println(people[2]);
        // int [] bil = new int --x bole
        Integer[] bil = new Integer[5];
        int[] jum = {1,2,4};
       
        // for tech
        for (int i=0; i<jum.length ; i++){
            System.out.println(jum[i]);
        }
        
        // while tech
        int j = 0;
        while (j < jum.length){
            System.out.println(jum[j]);
            // cara 2 dlm 1 line
            //System.out.printf("Val = %s", jum[j]); // display cara 2
            j++;
        }
        
        
        
    }
    
}
