import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inDuLieu {
    public static void main(String[] args) {
        try {
            String fileName = "taptintest.txt";
            // BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // String line;
            // while ((line = reader.readLine()) != null) {

            // System.out.println(line);
            // }

            // reader.close();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            char[] buffer = new char[100]; // Đọc 100 ký tự đầu tiên

            int charsRead;
            while ((charsRead = reader.read(buffer, 0, buffer.length)) != -1) {
                content.append(buffer, 0, charsRead);
            }

            reader.close();

            String result = content.toString();
            if (result.length() >= 100) {
                System.out.println(result.substring(0, 100));
            } else {
                System.out.println(result);
            }

            System.out.println("Tong so ky tu: " + result.length());
        } catch (IOException e) {

        }
    }
}
