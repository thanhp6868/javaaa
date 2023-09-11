import java.util.Scanner;

public class bai1_Dethi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // de1
        System.out.println("de 1 ");
        int a, b;

        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            int j = 0;
            while (j * j <= i) {
                if (j * j == i) {
                    sum += i;
                    count++;
                }
                ++j;
            }
        }
        System.out.println((float) sum / count);

        // de 2
        System.out.println("de 2 ");
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        sum = 0;
        for (int i = 0; i < a; i++) {
            if (i % b != 0)
                sum += i;
        }
        System.out.println(sum);

        // de 4
        sum = 0;
        System.out.println("de 4 ");
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0 && i % 100 != 0)
                sum += i;
        }
        System.out.println(sum);

        // de 5
        sum = 0;
        System.out.println("de 5 ");
        System.out.println("Nhap so bat ky: ");
        a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i % 7 == 0 && i % 30 != 0)
                sum += i;
        }
        System.out.println(sum);

        // de 6 giong de 1

        // de 7 giong de 4

        // de 8 giong de 2

        sc.close();
    }
}
