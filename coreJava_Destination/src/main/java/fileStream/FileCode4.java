package fileStream;

import java.io.*;

public class FileCode4 {
    public static void main(String[] args) throws IOException {
        String inputPath = "/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/input.txt";
        String outputPath ="/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/output.txt";

        FileReader fr = new FileReader(inputPath);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(outputPath);
        BufferedWriter bw = new BufferedWriter(fw);

        int temp;

        while ((temp = br.read())!= -1){
            bw.write(temp);
        }
        System.out.println("operation completed ");
        fr.close();
        fw.close();
        br.close();
        bw.close();

    }
}
