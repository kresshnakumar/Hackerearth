import java.util.*;

class SeatArrangement {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        int[] array = {-11,12,11,10,9,8,7,6,5,4,3,2};
        while (i < t) {
            int num = Integer.parseInt(sc.nextLine());
            int rem = num % 12;
            int quo = num / 12;
            int ret = array[rem] + (12 * quo);
            if(num % 6 ==0 || ret %6 == 0) {
                System.out.println(ret + " "+ "WS");
            }
            else if((num+1) % 6 == 0 || (ret+1) % 6 == 0) {
                System.out.println(ret+" "+"MS");
            }
            else {
                System.out.println(ret+" "+"AS");
            }
            i++;
        }
    }
}