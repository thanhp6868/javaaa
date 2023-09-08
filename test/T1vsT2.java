import java.util.*;

public class T1vsT2 {
    public static void main(String[] args) {
        int iChan = 0;
        int iLe = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int i = 0;
        while (n > 0) {
            i++;
            int tg = n % 10;
            n = (n - tg) / 10;
            if (i % 2 == 0) {
                iChan += tg;
            } else
                iLe += tg;

        }
        System.out.println("tong cac so vi tri le: ");
        if (i % 2 == 0) {
            System.out.println(iChan);
        } else
            System.out.println(iLe);

        sc.close();

    }
}
