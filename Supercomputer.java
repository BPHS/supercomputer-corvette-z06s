/*Author: Ryan Gardner, Paul Bush, The Z06s
*This is the start of a supercomputer
*Date: Halloween, 2016
*Desc.:Use some for loops to show how fast our computer is
*/
public class Supercomputer {
    public static void main(String [] args) {
        // Ryan's loops
        for (int x = 1; x <= 1000000; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x = 1; x <= 1000000; x+= 5) {
            System.out.print(x + " ");
        }
        System.out.println();
        // Paul's Loops
        for (int i = 100; i >= 1 ; i --) { 
            System.out.print(i + " "); 
        }
        System.out.println();
        
        for (int i = 1000; i <= 10000; i +=10) { 
            System.out.print(i + " "); 
        }
        System.out.println();
    }
}
