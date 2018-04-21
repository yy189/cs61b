public class Discussion1 {
	public static int fib(int n) {
		int i = 0;
		int j = 1;
		if (n == 0) return i;
		if (n == 1) return j;
		for (int k = 2; k < n; k++) {
			int temp = i;
			i = j;
			j = temp + j;
		}
		return j;
	}

	public static int fib2(int n, int k, int f0, int f1) {
		if (k == n-1) return f1;
		else return fib2(n, k+1, f1, f0+f1);
	}
	public static void main(String[] args) {
		System.out.println(fib2(9, 1, 0, 1));
	}
}