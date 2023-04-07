package pl.codecool.javainout.Zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad4 {

    private final File file;
    private String longestWord;
    private Scanner scanner;

    public Zad4(File file) {
        this.file = file;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String findLongestWordInFile() throws FileNotFoundException {
        setScanner(new Scanner(file));
        setLongestWord("");

        while (scanner.hasNext()) {
            String current = scanner.next();

            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }

        return longestWord;
    }
}
