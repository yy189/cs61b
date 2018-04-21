public class LargerDemo {
	/** Returns the larger of x and y. */
	public static int larger(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	public static void main(String[] args) {
		System.out.println(larger(-5, 10));
	}
}

/*
1. To define a function in Java, we use "public static".
2. Functions in Java return only one value.
*/