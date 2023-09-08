import java.util.*;

public class SHHvsSNT_tbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0)
                    dem++;
            }
            if (dem == 0) {
                {
                    s += a[i];
                    count++;
                }
            }
        }
        System.out.println("tbc snt: " + s + "/" + count);

        s = 0;
        count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= a[i] / 2; j++) {
                if (a[i] % j == 0)
                    sum += j;
            }
            if (sum == a[i]) {
                s += a[i];
                count++;
            }
        }
        System.out.println("tbc SHH: " + s + "/" + count);

    }

}
