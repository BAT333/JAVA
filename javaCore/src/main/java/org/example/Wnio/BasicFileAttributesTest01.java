package org.example.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
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


        LocalDateTime dateTime = LocalDateTime.now();
        file.toFile().setLastModified(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        FileTime from = FileTime.from(dateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(file,from);

        System.out.println(Files.isWritable(file));
        System.out.println(Files.isReadable(file));
        System.out.println(Files.isExecutable(file));


    }
}
