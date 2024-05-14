package org.example.VIo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            System.out.println(bufferedReader.readLine());
            String reade ;
            while ((reade = bufferedReader.readLine())!=null){
                System.out.println(reade);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
