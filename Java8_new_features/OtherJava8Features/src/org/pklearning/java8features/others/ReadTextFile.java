package org.pklearning.java8features.others;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadTextFile {
    public static void main(String[] args) {
        Path path= Paths.get("src","Reader.txt");
        try (Stream<String> lines= Files.lines(path)){
            lines.filter((s)->s.contains("WARNING")).findFirst().ifPresent(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();;
        }
    }
}
