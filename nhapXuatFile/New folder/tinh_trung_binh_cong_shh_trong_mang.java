
import java.util.Scanner;
public class tinh_trung_binh_cong_shh_trong_mang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Nhập số phần tử của mảng (số nguyên dương): ");
			n = scanner.nextInt();
		}while(n <= 0);
		
		int[] arr = new int[n];
		System.out.println("Nhập các phần tử của mảng: ");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		for(int num : arr) {
			if(isPerfect(num)) {
				sum += num;
				count++;
			}
		}
		
		if(count > 0) {
			int average = sum / count;
			System.out.println("Trung bình cộng số hoàn hảo trong mảng: " + average);
		}
		else {
			System.out.println("Không tồn tại số hoàn hảo trong mảng.");
		}
        scanner.close();
	}
	
	public static boolean isPerfect(int num) {
		if(num <= 1) {
			return false;
		}
		int sumOfDivisors = 1;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(num % i == 0) {
				sumOfDivisors += i;
				if(i != num / i) {
					sumOfDivisors += num / i;
				}
			}
			
		}
		return sumOfDivisors == num;
	}

}

