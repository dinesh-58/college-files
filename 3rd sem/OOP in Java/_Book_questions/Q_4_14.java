// remove decimal point from input 
// Alternative to this method is take string input
// Separate into 2 strings (integer part & fractional part ignoring decimal symbol)
// print concatenation of the 2

import java.util.Scanner;

public class Q_4_14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // take double input 
        System.out.println("Enter decimal value");
        double og = in.nextDouble();
        
        // convert to string
        String s = ""+og;
        int i;

        for (i=s.length()-1; s.charAt(i)!='.'; i--) {
            og*=10;
        }
        System.out.println("You have "+(int)og+" paisa.");
         
    }
}