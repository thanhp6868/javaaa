import java.util.Scanner;

public class soDauVaCuoi {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int sum = 0;
        sum += n % 10;
        while (n > 0) {
            int tg = n % 10;
            n = (n - tg) / 10;
            if (n == 0)
                sum += tg;
        }
        System.out.println(sum);
        sc.close();
    }
}
