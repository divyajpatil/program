import java.lang.annotation.Retention;

public class fibonacci {
    public static void main(String[] args) {
        int m = 5;
        for (int i = 0; i < m; i++) {
            System.out.println(fibser(m));
        }
    }

    public static int fibser(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibser(n - 1) + fibser(n - 2));
        }

    }
}
