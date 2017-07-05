import java.util.Scanner;

class Fibbo {
	final int MAX = 100;
	final int MIN = -1;
	int[] lookup = new int[MAX];
	public void initialize() {
		for (int i = 0; i < MAX ; i++ ) {
			lookup[i] = MIN;
		}
	}
	public int fibo(int number) {
		if (lookup[number] == MIN) {
			if(number <= 1) {
				lookup[number] = 1;
			}
			else {
				lookup[number] = fibo(number - 1) + fibo(number - 2);
			}
		}
		return lookup[number];
	}
}
public class FiboMemoize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		Fibbo fb = new Fibbo();
		fb.initialize();
		System.out.println(fb.fibo(num));
	}
}