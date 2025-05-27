package fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCode1 {
    public static void main(String[] args) throws IOException {
        String inputPath = "/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/input.txt";
        String outputPath ="/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/output.txt";
        FileInputStream fis = new FileInputStream(inputPath);
        FileOutputStream fout = new FileOutputStream(outputPath);
        int temp;
        
        while ((temp = fis.read())!= -1){
            fout.write(temp);
        }
        System.out.println("operation completed ");
        fis.close();
        fout.close();

    }
}
