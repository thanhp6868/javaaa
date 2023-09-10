import java.util.Scanner;

public class soChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a, b;

        // System.out.println("Nhap a: ");
        // a = sc.nextInt();
        // System.out.println("Nhap b: ");
        // b = sc.nextInt();
        // int sum = 0;
        // int count = 0;
        // for (int i = a; i <= b; i++) {
        // int j = 0;
        // while (j * j <= i) {
        // if (j * j == i) {
        // sum += i;
        // count++;
        // }
        // ++j;
        // }
        // }

        // bai giai thua
        int n;
        n = sc.nextInt();
        float sum2 = (float) 3 / 2;

        for (int i = 2; i <= n; i++) {
            float tg = 1;
            for (int j = 1; j <= i; j++) {
                tg *= j;
            }
            sum2 += ((float) (i + 2) / ((float) (i - 1) * tg));
        }
        System.out.println(sum2);

        sum2 = (float) 0.5;
        for (int i = 2; i <= n; i++) {
            int gt = 1;
            for (int j = 1; j <= i; j++) {
                gt *= j;
            }
            sum2 += (float) ((float) (i - 1) / ((float) i * gt));
        }
        System.out.println(sum2);
    }
}
