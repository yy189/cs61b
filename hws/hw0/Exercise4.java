public class Exercise4 {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < 0) {
                continue;
            }
            else {
                for (int j = i + 1; j < a.length && j <= i + n; j++) {
                    if (j == a.length) {
                        break;
                    }
                    a[i] += a[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
}