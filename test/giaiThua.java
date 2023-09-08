import java.util.Scanner;

public class giaiThua {
    public static void main(String[] args) {
        int n;
        int ts = 0;
        int ms = 1;
        float s = 1 / 2;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i <= n) {
            ts = i;
            ms = ms * 2 * i * (2 * i + 1);
            s += (ts / ms);
            i++;
        }
        ;
        System.out.println(s);
        sc.close();
    }
}
