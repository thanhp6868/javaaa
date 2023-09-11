import java.util.Scanner;

public class bai1_Dethi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // de1
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

        sc.close();
    }
}
