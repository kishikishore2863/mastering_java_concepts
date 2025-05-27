package fileStream;

import java.io.*;

public class FileCode3 {
    public static void main(String[] args) throws IOException {
     String inputPath ="/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/input.txt";
     String outputPath ="/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/output.txt";


        FileInputStream fis = new FileInputStream(inputPath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fw = new FileOutputStream(outputPath);
        BufferedOutputStream bw =new BufferedOutputStream(fw);

        int temp;

        while ((temp= bis.read())!=-1){
            bw.write(temp);
        }



    }
}
