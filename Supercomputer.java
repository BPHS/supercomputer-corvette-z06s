/*Author: Ryan Gardner, Paul Bush, The Z06s
*This is the start of a supercomputer
*Date: Halloween, 2016
*Desc.:Use some for loops to show how fast our computer is
*/
import java.util.Scanner;
public class Supercomputer {
    public static void main(String [] args) {
        Scanner FTC = new Scanner(System.in);
        System.out.println("Please select one of the following loops");
        System.out.println("1.) Counting to 1000000 by 1s");
        System.out.println("2.) Counting to 1000000 by 5s");
        System.out.println("3.) Counting dowm to 1 from 100 by 1s");
        System.out.println("4.) Counting to 10000 from 1000 by 10s");
        System.out.print("Your choice: ");
        String choice = FTC.nextLine();
        // Ryan's loops
        if (choice.equals("1")) {
            for (int x = 1; x <= 1000000; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        } else if (choice.equals("2")) {
            for (int x = 1; x <= 1000000; x+= 5) {
                System.out.print(x + " ");
            }
            System.out.println();
        
        // Paul's Loops    
        } else if (choice.equals("3")) {
            for (int i = 100; i >= 1 ; i --) { 
                System.out.print(i + " "); 
            }
            System.out.println();
        } else if (choice.equals("4")) {
           for (int i = 1000; i <= 10000; i +=10) { 
                System.out.print(i + " "); 
            }
            System.out.println(); 
        }
    }
}
