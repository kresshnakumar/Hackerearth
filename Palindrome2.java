import java.util.*;

class Palindrome2 {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());

        for (int i = 2; i <= N; i++) {
            int count = 0;
            for(int j = i; j > 0 ; j--) {
                if (i % j == 0 ) {
                    count++;
                }
            }
            if ( count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
