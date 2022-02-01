package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumber {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Resources/practice.txt");
        boolean exists = Files.exists(path);
        System.out.println(exists);
        try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);){
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
