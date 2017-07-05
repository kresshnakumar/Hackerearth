import java.util.*;

class Days {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(i < t) {
            int no = Integer.parseInt(sc.nextLine());
        	String str = sc.nextLine();
        	String[] s = str.split(" ");
            int[] arr = new int[7];
            for (int z = 0; z<7 ; z++) {
                arr[z] = Integer.parseInt(s[z]);
            }
            int j = 0;
            int count = 0;
            int index = 0;
        	while(count < no) {
                if(arr[j] != 0) {
                    count = count + arr[j];
                    index = j;
                }
                j = (j+1) % 7;
            }
            switch(index+1){
                case 1: System.out.println("MONDAY");
                        break;
                case 2: System.out.println("TUESDAY");
                        break;
                case 3: System.out.println("WEDNSDAY");
                        break;
                case 4: System.out.println("THURSDAY");
                        break;
                case 5: System.out.println("FRIDAY");
                        break;
                case 6: System.out.println("SATURDAY");
                        break;
                case 7: System.out.println("SUNDAY");
                        break;
            }
        	i++;
        }
    }
}