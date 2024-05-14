package org.example.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\rafae\\IdeaProjects\\JAVA\\Hello.java");
        System.out.println(path.getFileName());
    }
}
