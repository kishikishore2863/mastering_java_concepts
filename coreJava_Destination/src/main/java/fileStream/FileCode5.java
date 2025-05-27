package fileStream;

import java.io.File;
import java.io.IOException;

public class FileCode5 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/sample.txt");
        boolean res = f.createNewFile();
        if(res ){
            System.out.println("file created");
        }else{
            System.out.println("file not created");
        }

    }
}
