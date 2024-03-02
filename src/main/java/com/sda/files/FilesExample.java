package com.sda.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FilesExample {

    public static void main(String[] args) {
        try {
            System.out.println("Let's use try catch");
            String empty = null;
//            empty.toLowerCase();
            System.out.println("After the toLowerCase() method");
        } catch (Exception e) {
            System.out.println("haha - null");
        } finally {
            System.out.println("oh - null");
        }

        System.out.println("Let's read some text file");
        Path fileLocation = Path.of("example.txt");

//        Stream<String> stream = null;
//        try {
//            stream = Files.lines(fileLocation);
//
//            stream.forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (stream != null) {
//                stream.close();
//            }
//        }

        try (Stream<String> stream = Files.lines(fileLocation)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
