import java.util.Scanner;

public class timSoBeNhatTrongN {
    public static void main(String[] args) {
        int n;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        

        while (n > 0) {
            int tg = n % 10;
            n = (n - tg) / 10;
            if (min > tg)
                min = tg;
        }
        
        System.out.println(min);
        sc.close();
    }
}
