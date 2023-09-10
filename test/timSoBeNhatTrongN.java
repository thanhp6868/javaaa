import java.util.Scanner;

public class timSoBeNhatTrongN {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        while (n > 0) {
            int tg = n % 10;
            n = (n - tg) / 10;
            if (min > tg)
                min = tg;
        }
        System.out.println(min);
        sc.close();
    }
}
