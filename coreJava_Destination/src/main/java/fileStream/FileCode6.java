package fileStream;

import java.io.File;
import java.io.IOException;

public class FileCode6 {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/kishikishore/intelliJ/mastering_java/coreJava_Destination/src/main/java/fileStream/sample.txt");
        System.out.println("The execution permission of this file set to:"+f.canExecute());
        System.out.println("The read permission of this file set to:"+f.canRead());
        System.out.println("The write permission of this file set to:"+f.canWrite());
        System.out.println("Is the file present?:"+f.exists());
        System.out.println("Absolute path"+f.getAbsolutePath());
        System.out.println("canonical path"+f.getCanonicalPath());
        System.out.println("The root class is:"+f.getClass());
        System.out.println("The free space count in bytes="+f.getFreeSpace());
        System.out.println("The file name is:"+f.getName());
        System.out.println("The Parent path of the file is:"+f.getParent());
        System.out.println("Total space allocated for this file "+f.getTotalSpace());
        System.out.println("The usable space allocated for the file is :"+f.getUsableSpace());
        System.out.println("Is the specified path an absolute path?"+f.isAbsolute());
        System.out.println("Is the specified path point to a path :"+f.isFile());

    }
}
