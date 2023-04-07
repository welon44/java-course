package pl.codecool.javainout.fileclass;

import java.io.File;
import java.util.Arrays;

public class FileClassExample {

    public static void main(String[] args) {

        File file = new File("src/main/resources/file_class/file_class.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(File.separator);
        System.out.println(File.separatorChar);

        System.out.println("Line separator: " + System.getProperty("file.separator"));
        System.out.println(System.lineSeparator());
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);

        System.out.println("get Parent " + file.getParent());
        System.out.println("get Parent file " + file.getParentFile());

        System.out.println("List " + Arrays.toString(file.list()));
        System.out.println("List files " + Arrays.toString(file.listFiles()));

        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
    }
}
