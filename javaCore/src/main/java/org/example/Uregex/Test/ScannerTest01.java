package org.example.Uregex.Test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "RAFAEL, AMANDA";
        String[] names = text.split(",");
        for(String name: names){
            System.out.println(name.trim());
        }
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next().trim());
        }
    }
}
