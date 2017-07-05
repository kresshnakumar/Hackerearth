/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes
import java.util.*;


class TOUpperLower {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String s = "";
        for (int i = 0; i < str.length(); i++ ) {
        	char c= str.charAt(i);
        	int k = (int)c;
        	if(k >=65 && k <=90)
        		k = k+32;
        	else
        		k = k-32;
        	s = s+(char)k;
        }
        System.out.println(s);
    }
}