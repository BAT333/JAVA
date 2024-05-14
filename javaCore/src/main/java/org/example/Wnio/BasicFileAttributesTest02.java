package org.example.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Directory");
        if(Files.notExists(path)){
            Files.createDirectory(path);
        }
        Path sub = Paths.get("Directory/subDirectory");
        if(Files.notExists(sub)){
            Files.createDirectories(sub);
        }
        Path file = Paths.get(sub.toString(),"file.txt");
        if(Files.notExists(file)){
            Files.createFile(file);
        }
        Path source = file;
        Path target = Paths.get(file.getParent().toString(),"filesRe.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

      BasicFileAttributes basicFileAttributes =  Files.readAttributes(file, BasicFileAttributes.class);
        System.out.println(basicFileAttributes.creationTime());
        System.out.println(basicFileAttributes.lastModifiedTime());
        System.out.println(basicFileAttributes.lastAccessTime());
        BasicFileAttributeView view =  Files.getFileAttributeView(file, BasicFileAttributeView.class);
        view.setTimes(null,null,null);




    }
}
