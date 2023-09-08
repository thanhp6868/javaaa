import java.util.Scanner;

public class tinh_trung_binh_cong_snt_trong_mang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Nhập số n phần tử mảng

		int n;
		do {
			System.out.println("Nhập vào số phần tử của mảng (số nguyên dương): ");
			n = scanner.nextInt();
		}while(n <= 0);
		
		//Khởi tạo mảng
		int[] arr = new int[n];
		
		//Nhập vào các phần tử trong mảng
		System.out.println("Nhập vào các phần tử của mảng");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		int count = 0;
		for(int num : arr) {
			if(isPrime(num)) {
				sum += num;
				count++;
			}
		}
		
		if(count > 0) {
			int average = sum / count;
			System.out.println("Trung bình cộng các số nguyên tố trong mảng: " + average);
		}
		else {
			System.out.println("Không tồn tại số nguyên tố trong mảng");
		}
		scanner.close();
	}
		//Hàm kiểm tra số nguyên tố
		public static boolean isPrime(int num) {
			if(num <= 1) {
				return false;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
	}

}

