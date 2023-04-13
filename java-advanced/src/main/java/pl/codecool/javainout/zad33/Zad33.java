package pl.codecool.javainout.zad33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad33 {

    private final String directory;

    public Zad33(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public List<String> listFiles() {

        return Stream.of(Objects.requireNonNull(new File(getDirectory()).listFiles()))
                .map(File::getName)
                .filter(name -> name.endsWith(".png") || name.endsWith(".jpg"))
                .collect(Collectors.toList());
    }

    public List<String> listFilesFromSubdirectories() throws IOException {
        Path start = Paths.get(directory);
        try (Stream<Path> stream = Files.walk(start, 2)) {
            return stream
                    .map(String::valueOf)
                    .filter(name -> name.endsWith(".png") || name.endsWith(".jpg"))
                    .collect(Collectors.toList());
        }
    }
}
