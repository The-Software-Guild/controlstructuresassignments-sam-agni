
public class DoWhileLoop {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp = 0;
		int i = 9;
		System.out.println(a);
		do {
			System.out.println(b);
			temp = a;
			a = b;
			b = temp + b;
			i--;
		} while (i > 0);

	}

}
