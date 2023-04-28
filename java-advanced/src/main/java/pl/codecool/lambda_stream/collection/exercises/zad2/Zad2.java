package pl.codecool.lambda_stream.collection.exercises.zad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Zad2 {

    private static final String FILE_URL = "src/main/resources/stream/tekst.txt";

    private Set<String> stringSet = new HashSet<>();
    private List<String> stringList = new ArrayList<>();

    private List<String> getListOfWords() throws IOException {
        Files.readAllLines(Path.of(FILE_URL)).forEach(line -> {
                                                          List<String> words = List.of(line.split(" "));
                                                          words.forEach(string -> stringList.add(string
                                                                                                         .replace("^[^a-zA-Z0-9]+$", "")));
                                                      });
        return stringList;
    }

    public int readAllWordsInFile() throws IOException {
        stringSet = new HashSet<>(getListOfWords());

        return stringSet.size();
    }

    public void readEveryWordCount() {
        Map<String, Long> map = stringList.stream()
                .collect(Collectors.groupingBy(word -> word,Collectors.counting()));

        map.forEach((word, count) -> System.out.println(word + ": "+ count));
    }
}
