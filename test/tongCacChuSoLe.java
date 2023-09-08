import java.util.Scanner;

public class tongCacChuSoLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumLe = 0;

        System.out.println("Nhap n:");
        n = sc.nextInt();
        while (n > 0) {
            int tg = n % 10;
            n = (n - tg) / 10;
            if (tg % 2 != 0)
                sumLe += tg;
        }
        System.out.println("tong cac chu so le: " + sumLe);
        sc.close();
        ;
    }
}
