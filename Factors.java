import java.util.*;

class Factors {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        int count = 0;
        int l = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int rem = l % k;
        int i = rem + (k-rem);
        while (i <= r) {
            if(i % k == 0) {
                count++;
                i = i + k;
            }
            else
                i++;
        }
        System.out.println(count);
    }
}