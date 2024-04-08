import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("src/main/resources/text.txt")) {
            System.out.println("result = " + IOUtils.toString(inputStream, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
