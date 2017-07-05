import java.util.*;

class Photo {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int no = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(i < no) {
        	String str = sc.nextLine();
        	String[] s = str.split(" ");
        	int wid = Integer.parseInt(s[0]);
        	int hgt = Integer.parseInt(s[1]);
        	if(hgt >= size && wid >= size  && wid == hgt) {
        		System.out.println("ACCEPTED");
        	}
        	else if (wid >= size && hgt >= size)
        		System.out.println("CROP IT");
        	else
        		System.out.println("UPLOAD ANOTHER");
        	i++;
        }
    }
}