package pl.codecool.homework.filereadwrite;

import java.io.*;

public class FileReadWrite {

    String FILE_NAME = "file";
    String PATH_TO_FILE = "src/main/resources/homework/filereadwrite/"+ FILE_NAME + ".txt" ;
    String fileNameReversed = new StringBuffer(FILE_NAME).reverse().toString();
    String PATH_TO_NEW_FILE = "src/main/resources/homework/filereadwrite/" + fileNameReversed + ".txt" ;

    File file = new File(PATH_TO_FILE);
    File fileNew = new File(PATH_TO_NEW_FILE);

    public void readAndWriteReversedFile() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(fileNew, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String nextLine = "";
        while ((nextLine = bufferedReader.readLine()) != null) {
            String reversed = new StringBuffer(nextLine).reverse().toString();
            System.out.println(reversed);
            bufferedWriter.write(reversed);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
