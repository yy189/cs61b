public class Exercise1b {
	public static void drawTriangle(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String agrs[]) {
		drawTriangle(10);
	}
}