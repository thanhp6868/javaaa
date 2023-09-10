import java.io.*;

public class dem_tap_tin_bat_dau_txt {
	public static boolean startWithTxt(String fileName) {
		String txtPrefix = "txt"; // txtPrefix: tiền tố
		if(fileName.length() < txtPrefix.length()) { // so sánh nếu tên file là 1 hoặc 2 ký tự thì out
			return false;
		}
		for(int i = 0; i < txtPrefix.length(); i++) {
			if(fileName.charAt(i) != txtPrefix.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	// txtdfbshdf.dfdhf
	//js.txt
	//txtdjdfhg
	
	public static void main(String[] args) {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập đường dẫn tập tin: ");
		try {
			String folderPath = inputReader.readLine(); // giống scanner , gán đườg dẫn vào inputReader
			File folder = new File(folderPath); // đưa đường dẫn vào đối tượng File 
			
			if(folder.isDirectory()) { // kiểm tra xem đường dẫn có dẫn đến thư mục hay ko 
				//true 
				File[] files = folder.listFiles(); // khởi tạo list để chứa các file, được gán dữ liệu từ  folder.listFiles()
				int txtFileCount = 0; // đếm file 
				
				for(File file: files) { //lặp: lấy từng đối tượng trong danh sách files 
					if(file.isFile() && startWithTxt(file.getName().toLowerCase())) { // kiểm tra xem có phải là file và nếu là file thì có bắt đầu bằng "txt" hay không
						txtFileCount++;
					}
				}
				// for(int i = 0; i< files.length; i++){
				// 	File file = files[i];
				// }
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

