package org.example.VIo.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader reader = new FileReader(file);) {
            System.out.println((char) reader.read());
            char[] chars = new char[30];
            reader.read(chars);
            for (char c: chars){
                System.out.print(c);
            }
            int reads;
            while ((reads = reader.read())!=-1){
                System.out.print((char) reads);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
