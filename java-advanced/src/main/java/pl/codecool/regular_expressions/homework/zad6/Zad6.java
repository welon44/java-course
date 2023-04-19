package pl.codecool.regular_expressions.homework.zad6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Zad6 {

    private final File file;
    private Scanner scanner;
    private List<String> strings;

    public Zad6(File file) {
        this.file = file;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public int countWordsInFile() throws FileNotFoundException {
        setScanner(new Scanner(file));
        setStrings(new ArrayList<>());
        Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);

        while (scanner.hasNext()) {
            String current = scanner.next();

            if (pattern.matcher(current).find()) {
                strings.add(current);
            }
        }

        return strings.size();
    }

}
