import java.util.Scanner;

public class MinCostPath {
	final static int MAX = 99999;
	public static int min(int x, int y, int z) {
		if(x < y) {
			return ( x < z ? x : z);
		}
		else
			return (y < z ? y : z);
	}
	public static int minCost(int[][] array, int r, int c) {
		if (r < 0 || c < 0) {
			return MAX;
		}
		else if ( r == 0 && c == 0) {
			return array[r][c];
		}
		else {
			return min(minCost(array, r-1,c), minCost(array, r,c-1), minCost(array,r-1,c-1)) + array[r][c];
		}
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