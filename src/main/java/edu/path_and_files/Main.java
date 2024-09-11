package edu.path_and_files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) throws IOException {
//        try {
//            Files.createFile(Path.of("test.txt"));
//        } catch (IOException e) {
//            System.out.println("file: "+ e.getMessage() +" is exist");
//        }
//

//        Write
        Path path = Path.of("test.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Files.writeString(path, "");

        for (int i = 0; i < 3; i++) {
            Files.writeString(path, "Hello World\n", APPEND);

        }

//        Read
        System.out.println(Files.readString(path, StandardCharsets.UTF_8));
    }
}