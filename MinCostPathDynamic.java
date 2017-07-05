import java.util.Scanner;

public class MinCostPathDynamic {
	final static int MAX = 99999;
	public static int min(int x, int y, int z) {
		if(x < y) {
			return ( x < z ? x : z);
		}
		else
			return (y < z ? y : z);
	}
	public static int minCost(int[][] array, int r, int c) {
		int tc[][] = new int[r+1][c+1];
		tc[0][0] = array[0][0];

		for (int i = 1; i <= r; i++) {
			tc[i][0] = tc[i-1][0] + array[i][0];
		}
		for (int j = 1; j <= c; j++ ) {
			tc[0][j] = tc[0][j-1] + array[0][j];
		}
		for (int i = 1; i <= r ; i++) {
			for (int j = 1; j <= c; j++) {
				tc[i][j] = min( tc[i-1][j], tc[i][j-1], tc[i-1][j-1]) + array[i][j];
			}
		}
		return tc[r][c];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		int col = Integer.parseInt(sc.nextLine());
		int array[][] = new int[row][col];
		for (int i = 0; i < row ; i++ ) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			for (int j = 0; j < col ; j++) {
				array[i][j] = Integer.parseInt(split[j]);
			}
		}
		System.out.print("Enter the element to search: eg 2,3");
		String input = sc.nextLine();
		String[] split = input.split(",");
		System.out.println( minCost ( array, Integer.parseInt(split[0]), Integer.parseInt(split[1]) ) );
	}
}