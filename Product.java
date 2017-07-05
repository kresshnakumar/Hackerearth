import java.lang.*;
import java.util.*;
import java.math.*;


class Product {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        
        Scanner input = new Scanner(System.in);
        int size = Integer.parseInt(input.nextLine());
        int value = (int) Math.pow(10,9) + 7;
        BigInteger answer = new BigInteger("1");
        int[] array = new int[size];
        String str = input.nextLine();
        String[] s = str.split(" ");
        for (int i = 0; i < size ;i++ ) {
            array[i] = Integer.parseInt(s[i]);
            //BigInteger bi = new BigInteger(array[i].toString());
            answer = (answer.multiply(BigInteger.valueOf(array[i]))).mod(BigInteger.valueOf(value));
        }
        System.out.println(answer);
    }
}