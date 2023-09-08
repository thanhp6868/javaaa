import java.io.*;
public class dem_tap_tin_bat_dau_txt {
	public static boolean startWithTxt(String fileName) {
		String txtPrefix = "txt";
		if(fileName.length() < txtPrefix.length()) {
			return false;
		}
		for(int i = 0; i < txtPrefix.length(); i++) {
			if(fileName.charAt(i) != txtPrefix.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập đường dẫn tập tin: ");
		try {
			String folderPath = inputReader.readLine();
			File folder = new File(folderPath);
			
			if(folder.isDirectory()) {
				File[] files = folder.listFiles();
				int txtFileCount = 0;
				
				for(File file: files) {
					if(file.isFile() && startWithTxt(file.getName().toLowerCase())) {
						txtFileCount++;
					}
				}
				System.out.println("Số lượng tập tin bắt đầu bằng kí tự 'txt': " + txtFileCount);
			}
			else {
			System.out.print("Đường dẫn không phải thư mục.");
			}
		}catch(IOException e) {
			System.out.println("Lỗi nhập xuất dữ liệu: " + e.getMessage());
		}
	}
}

