
import java.util.Scanner;
public class tinh_trung_binh_so_chinh_phuong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập số nguyên b: ");
		int b = scanner.nextInt();
		
		double result = averageOfPerfectSquares(a, b);
		System.out.println("Giá trị trung bình của số chính phương trong đoạn từ " + a + " đến " + b + " là " + result);
		scanner.close();
	}
	
	public static boolean isPerfectSquare(int num) {
		int sqrt = (int)Math.sqrt(num);
		return sqrt * sqrt == num;
	}
	
	public static double averageOfPerfectSquares(int a, int b) {
		int sum = 0;
		int count = 0;
		
		for(int num = a; num <= b; num++) {
			if(isPerfectSquare(num)) {
				sum += num;
				count++;
			}
		}
		
		if(count == 0) {
			return 0;
		}
		
		double average = (double)sum/count;
		return average;
	}
	
	

}

