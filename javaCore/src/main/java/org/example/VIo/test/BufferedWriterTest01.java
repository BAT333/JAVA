package org.example.VIo.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter writer = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("OIE AQUI RAFAEL");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
