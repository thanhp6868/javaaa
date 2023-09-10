import java.util.*;


public class tinhDaySo {
    public static void main(String[] args) {
        // khai báo biến:
        double s = 1.5;
        int n;
        Scanner sc = new Scanner(System.in); // khai báo đối tượng sc thuộc lớp Scanner để nhập dữ liệu
        System.out.println("Nhap n:"); // in ra màn hình
        n = sc.nextInt(); // gán giá trị nhập từ bàn phím vào n
        for (int i = 2; i <= n; i++) { // chạy for để tính
            s += ((i + (i + 1)) / ((i + 1) + (i + 2)));
        }
        System.out.println(s);
    }
}
