import java.util.*;

public class tinhtongDaySo {
    public static void main(String[] args) {
        int n, s = 0, s2 = 0, s3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cho bo may con so");
        
        do {
            n = sc.nextInt();
        } while (n < 100);

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
            System.out.println(s + " Khong phai SNT");
        sc.close();    
    }
}
