import java.util.*;


class TestClass1 {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */


        //Scanner
        Scanner s = new Scanner(System.in);
        int no_of_testCases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < no_of_testCases;i++) {
            int test = Integer.parseInt(s.nextLine());
            int array[] = new int[test];
            String input = s.nextLine();
            String[] split = input.split(" ");
            for(int j = 0;j<split.length;j++) {
                array[j] = Integer.parseInt(split[j]);
            }
            System.out.print(findmaxSumArray(array)+" ");
            System.out.println(findmaxSum(array));
        }
    }
    public static int findmaxSumArray(int[] arr) {
        int sum = 0;
        int max = -999;
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            }
            else {
                sum = sum + arr[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
    public static int findmaxSum(int[] arr) {
        int sum = 0;
        for(int k = 0; k<arr.length;k++) {
            if (arr[k] > 0) {
                sum = sum + arr[k];
            }
        }
        return sum;
    }
}