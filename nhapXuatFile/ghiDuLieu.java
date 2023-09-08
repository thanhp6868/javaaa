import java.io.*;

public class ghiDuLieu {
    public static void main(String[] args) {
        try {
            String fileName = "taptintest.txt"; // Tên của tệp tin đích
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            // Dữ liệu bạn muốn ghi vào tệp tin
            String data = "Hello, world!\nThis is a Java file write example.";
            // Ghi dữ liệu vào tệp tin
            writer.write(data);

            // Đóng luồng ghi
            writer.close();

            System.out.println("du lieu da duoc ghi thanh cong vao tap tin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
