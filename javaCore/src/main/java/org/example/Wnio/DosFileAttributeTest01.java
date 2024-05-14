package org.example.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path sub = Paths.get("Directory/subDirectory");
        Path file = Paths.get(sub.toString(),"file.txt");

        Files.setAttribute(file,"dos:hidden",true);
        Files.setAttribute(file,"dos:readonly",true);
        Files.setAttribute(file,"dos:hidden",false);
        Files.setAttribute(file,"dos:readonly",false );
        DosFileAttributes dosFileAttributes = Files.readAttributes(file,DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());
        DosFileAttributeView view = Files.getFileAttributeView(file, DosFileAttributeView.class);
        view.setHidden(false);
        view.setReadOnly(false);



    }
}
