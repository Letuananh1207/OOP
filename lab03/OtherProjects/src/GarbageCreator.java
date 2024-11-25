import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "src/test.exe";
        byte[] inputBytes = null;
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Path.of(filename));
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
            return;
        }

        startTime = System.currentTimeMillis();

        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
        	outputStringBuilder.append((char)b);
        }
        
        endTime = System.currentTimeMillis();

        System.out.println("Thời gian thực hiện: " + (endTime - startTime) + "ms");
    }
}
