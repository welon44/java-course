package pl.codecool.javainout.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/java/pl/codecool/javainout/path");

        Path path1 = Paths.get(path.toString(), "dira");

        Files.createDirectory(path1);

    }
}
