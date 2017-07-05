import java.util.*;
import java.lang.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int rows = Integer.parseInt(s.nextLine());
        int cols = Integer.parseInt(s.nextLine());
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = s.nextLine();
            String[] splitLine = line.split(" ");
            for(int j = 0; j < splitLine.length ; j++) {
                matrix[i][j] = Integer.parseInt(splitLine[j]);
            }
        }
        for(int i = 0; i < rows;i++) {
            for (int j = 0; j<cols;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
