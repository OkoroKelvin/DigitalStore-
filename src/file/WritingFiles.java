package file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("Resources/write.txt");
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("Hello World");
        writer.close();
        System.out.println("Done!");
    }
}
