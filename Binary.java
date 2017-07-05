import java.util.Scanner;

public class Binary {
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
				String binary = Integer.toBinaryString(x);
				int c1 = (int)Integer.bitCount(x);
				if(c1 == (p-c1))
					count++;
			}
			System.out.println(count);
			i++;
		}
	}
}