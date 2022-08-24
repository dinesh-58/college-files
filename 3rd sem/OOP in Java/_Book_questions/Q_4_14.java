//remove decimals 

import java.util.Scanner;

public class Prac {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // take double input 
        System.out.println("Enter decimal value");
        double og = in.nextDouble();
        
        // convert to string
        String s = ""+og;
        boolean found_decimal=false;
        int i;

        for (i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == '.') found_decimal=true;
            if (found_decimal == true) {
                og*=10;
            }
        }
        System.out.println("You have "+(int)og+" paisa.");
         
    }
}