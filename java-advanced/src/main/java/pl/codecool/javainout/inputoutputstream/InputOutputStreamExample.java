package pl.codecool.javainout.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamExample {

    public static void main(String[] args) throws IOException {

        final String FILE_PATH = "src/main/resources/input_output_stream/input_output_stream_data.txt";
        final String FILE_PATH_SAVE = "src/main/resources/input_output_stream/input_output_stream_saved.txt";

        FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH_SAVE);
//

        int r = fileInputStream.read();
        while (r != -1) {
            fileOutputStream.write(r);
            r = fileInputStream.read();
        }

        fileOutputStream.close();
        fileInputStream.close();

    }
}
