package FileDemo;

import java.io.File;
import java.util.Date;

public class FileTest {

    private static final String FilePath = ".";

    public static void main(String[] args) {

        File file = new File(FilePath);
        System.out.println("Does this file exists? " + file.exists());
        System.out.println("Is this a file? " + file.isFile());
        System.out.println("Is this a directory? " + file.isDirectory());
        System.out.println("The size of this file is: " + file.length()+ " bytes");
        System.out.println("The last modified date is: " + new Date(file.lastModified()).toLocaleString());

        String[]filenames = file.list();
        for (int i = 0; i < filenames.length; i++) {
            System.out.println(filenames[i]);

        }


    }

}
