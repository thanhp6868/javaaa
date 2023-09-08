import java.util.*;

public class tinhtongDaySo {
    public static void main(String[] args) {
        int n, s = 0, s2 = 0, s3 = 0;
        int min = 9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cho bo may con so");
        do {
            n = sc.nextInt();
        } while (n <= 0);

        while (n != 0) {
            int tg = n % 10;
            s += tg; // tính tổng
            n = (n - tg) / 10;
        }
        int dem = 0;
        for (int j = 2; j < s - 1; j++) {
            if (s % j == 0)
                dem++;
        }
        if (dem == 0)
            System.out.println(s + " Co la SNT");
        else
            System.out.println("Khong phai SNT");

        System.out.println(s);
        System.out.println(min);
        System.out.println(s2);
        System.out.println(s3);

    }
}
