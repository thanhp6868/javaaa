import java.util.*;

public class tongCacChuSoMin_Max_TrongMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int min = Integer.MAX_VALUE;
        int vt = 0;

        System.out.println("Nhap n:");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            int sum = 0;
            int bientam = a[i];
            while (bientam > 0) {
                int tg = bientam % 10;
                sum += tg;
                bientam = (bientam - tg) / 10;
            }
            if (min > sum) {
                min = sum;
                vt = i;
            }
        }

        System.out.println(a[vt]);
        sc.close();
    }
}
