import java.util.Scanner;

public class soT3vsT5 {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        while (n > 0) {
            int tg = n % 10;
            if (n > 9999 && n <= 99999)
                sum += tg;
            if (n > 99 && n <= 999)
                sum += tg;
            n = (n - tg) / 10;
        }
        System.out.println(sum);
    }
}
