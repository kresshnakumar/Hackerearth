/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes
import java.util.*;


class Palindrome {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String s = "";
        boolean b = false;
        for (int i = 0; i < str.length()/2; i++ ) {
        	if(str.charAt(i) != str.charAt(str.length()-i-1))
                b = true;
            if(b) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}