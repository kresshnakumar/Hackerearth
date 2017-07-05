import java.util.Scanner;

public class EditDistance {
	public static int min(int x, int y, int z) {
		if(x < y) {
			return ( x < z ? x : z);
		}
		else
			return (y < z ? y : z);
	}
	public static int editDis(String s1, String s2, int m, int n) {
		if (m == 0)
			return n;
		else if (n == 0)
			return m;
		else if(s1.charAt(m-1) == s2.charAt(n-1))
			return editDis(s1,s2,m-1,n-1);
		else
			return 1 + min ( editDis(s1,s2,m,n-1), editDis(s1,s2,m-1,n), editDis(s1,s2,m-1,n-1));

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(editDis(str1,str2,str1.length(),str2.length()));
	}
}