
import java.io.*;

public class in_100_ki_tu_trong_tap_tin {

	public static void main(String[] args) {
		BufferedReader reader = null;
		
		try {
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Nhập đường dẫn tập tin: ");
			String filePath = inputReader.readLine();
			
			File file = new File(filePath);
			reader = new BufferedReader(new FileReader(file));
			
			char[] buffer = new char[100];
			int bytesRead = reader.read(buffer);
			
			if(bytesRead == -1) {
				System.out.println("Tập tin rỗng.");
			}
			else {
				String content = new String(buffer, 0, bytesRead);
				System.out.println("Nội dung " + Math.min(bytesRead, 100) + "kí tự đầu tiên trong tập tin:");
				System.out.println(content);
			}
			//[tiến, tiến2,..] -> tiến tiến2
		}catch (IOException e) {
			System.out.println("Lỗi đọc tập tin: " + e.getMessage());
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			}catch (IOException e){
				System.out.println("Lỗi khi đóng tập tin: " + e.getMessage());
			}
		}
	}

}

