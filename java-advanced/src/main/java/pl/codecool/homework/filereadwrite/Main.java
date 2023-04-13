package pl.codecool.homework.filereadwrite;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReadWrite fileReadWrite = new FileReadWrite();
        fileReadWrite.readAndWriteReversedFile();
    }
}
