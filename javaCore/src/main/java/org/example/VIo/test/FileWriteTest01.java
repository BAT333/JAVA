package org.example.VIo.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter writer = new FileWriter(file,true);) {
            file.createNewFile();
            writer.write("OIE AQUI RAFAEL \n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(file.exists()){
                file.delete();
            }
        }


    }
}
