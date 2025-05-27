package fileStream;

import java.io.*;

public class FileCode2 {
    public static void main(String[] args) throws IOException {
        String inputPath = "/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/input.txt";
        String outputPath ="/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/output.txt";
        FileReader fis = new FileReader(inputPath);
        FileWriter fout = new FileWriter(outputPath);
        int temp;

        while ((temp = fis.read())!= -1){
            fout.write(temp);
        }
        System.out.println("operation completed ");
        fis.close();
        fout.close();

    }
}
