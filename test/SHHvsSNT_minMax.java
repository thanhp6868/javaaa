import java.util.*;

public class SHHvsSNT_minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int min = Integer.MAX_VALUE;
        System.out.println("Nhap n:");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // tim min snt
        // tim max: max = Integer.MIN_VALUE va doi dau dieu kien phia duoi

        for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0)
                    dem++;
            }
            if (dem == 0) {
                if (min > a[i])
                    min = a[i];
            }
        }
        System.out.println("Snt min: " + min);

        // tim min shh
        min = Integer.MAX_VALUE;
        // tim max: max = Integer.MIN_VALUE va doi dau dieu kien phia duoi
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= a[i] / 2; j++) {
                if (a[i] % j == 0)
                    sum += j;
            }
            if (sum == a[i]) {
                if (min > a[i])
                    min = a[i];
            }
        }
        System.out.println("SHH min: " + min);

    }

}
