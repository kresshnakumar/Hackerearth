import java.util.Scanner;

public class EasyCounting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int i = 0;
		while (i < t) {
			String str = sc.nextLine();
			String[] s = str.split(" ");
			int l = Integer.parseInt(s[0]);
			int r = Integer.parseInt(s[1]);
			int p = Integer.parseInt(s[2]);
			int count = 0;
			for (int x = l; x<=r; x++) {
				String remander = findLength(x);
				String split[] = remander.split(" ");
				int c1 = Integer.parseInt(split[1]);
				int c2 = Integer.parseInt(split[2]);
				//System.out.println("c1:"+c1+" c2:"+c2);
				if((c1+c2) == p && c1 == c2) {
					count++;
				}
				else if((c1+ c2) < p) {
					while(split[0].length() < p) {
						split[0] = "0"+split[0];
						c1++;
					}
					if(c1 == c2) {
						count++;
					}
				}
				//System.out.println("c1:"+c1+" c2:"+c2);
			}
			System.out.println(count);
			i++;
		}
	}
	public static String findLength(int num) {
		String k = "";
		int c1 = 0;
		int c2 = 0;
		while(num > 0) {
			if(num % 2 == 0) {
				k = k+"0";
				c1++;
			}
			else {
				k = k + "1";
				c2++;
			}
			num = num /2;
		}
		return k+" " + c1+" "+c2;
	}
}