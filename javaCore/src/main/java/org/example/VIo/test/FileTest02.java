package org.example.VIo.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("DIRETORIO");
        try {
            file.mkdir();
            File file2 = new File(file,"FILE.txt");
            file2.createNewFile();
            file2.renameTo(new File(file,"renomeado.txt"));
            file2.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(file.exists()){
                file.delete();
            }
        }



    }
}
