package org.pklearning.java8features.others;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//list is for current folder
//walk is for recursive search
public class ListFilesInDirectory {
    public static void main(String[] args) {
        Path path= Paths.get("src");
        try(Stream<Path> paths= Files.list(path)){
            paths.filter((path1)->path1.toFile().isDirectory()).forEach(path1 -> System.out.println(path1.getFileName()));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try(Stream<Path> paths= Files.walk(path)){
            paths
//                    .filter((path1)->path1.toFile().isFile())
                    .forEach(
                    path1 -> {
                        for(int i=1;i<=path1.getNameCount();i++) System.out.print("-");
                        System.out.println(path1.getFileName());
                    }
            );
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //limit the depth of walk
        System.out.println("____________limit the depth of walk___________");
        try(Stream<Path> paths= Files.walk(path,4)){
            paths
//                    .filter((path1)->path1.toFile().isFile())
                    .forEach(
                            path1 -> {
                                for(int i=1;i<=path1.getNameCount();i++) System.out.print("-");
                                System.out.println(path1.getFileName());
                            }
                    );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
