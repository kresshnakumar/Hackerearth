import java.util.Scanner;
public class BubbleSort {
    private static int array[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        array = new int[size];
        for (int i = 0; i < size ; i++ ) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        sort();
        display();
    }
    public static void sort() {
        for (int x = 0;  x < array.length; x++) {
            for ( int z = 1; z < array.length-x; z++) {
                if (array[z-1] > array[z]) {
                    int temp = array[z];
                    array[z] = array[z-1];
                    array[z-1] = temp;
                }
            }
        }
    }
    public static void display() {
        for (int i = 0 ; i < array.length; i++ ) {
            System.out.print(array[i]+" ");
        }
    }
}