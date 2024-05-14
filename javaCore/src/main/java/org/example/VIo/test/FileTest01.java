package org.example.VIo.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            file.createNewFile();
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(file.exists()){
                file.delete();
            }
        }


    }
}
