import java.util.Scanner;

public class SpiralPrintMatirx {

	public static int spiralPrint(int[][] array,int row,int col) {
		
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
		spiralPrint(array,row,col);
	}	
}