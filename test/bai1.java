import java.util.*;
import java.math.*;

public class bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in); //

        System.out.println("Nhap n:");
        n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("so thu " + (i + 1) + ":");
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
                s += a[i];
                count++;
            }
        }
        if (count == 0)
            System.out.println("khong co snt!");
        else {

            System.out.println(s + "," + count);
            System.out.println("ket qua ne cu:" + s / count + "." + s % count);

        }
    }
}