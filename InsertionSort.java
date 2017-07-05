import java.util.Scanner;
public class InsertionSort {
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
        for (int x = 1;  x < array.length; x++) {
            int key = array[x];
            int z;
            for (   z = x-1; z >=0; z-- ) {
                if (array[z] > key) {
                    array[z + 1] = array[z];
                }
            }
            array[z+1] = key;
        }
    }
    public static void display() {
        for (int i = 0 ; i < array.length; i++ ) {
            System.out.print(array[i]+" ");
        }
    }
}