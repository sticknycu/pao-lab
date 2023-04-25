package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileExample {


    public static void main(String[] args) throws IOException {
        filesNio();
        fileStreams();
    }

    public static void filesNio() throws IOException {
        // Create a new file
        File file = new File("example.txt");
        file.createNewFile();

        /*if (file.createNewFile()) {
            System.out.println("created!");
        } else {
            System.out.println("error!");
        }*/

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }

        // Write some data to the file
        Files.writeString(file.toPath(), "Hello, World!");

        //byte[] bytesString = "Hello World".getBytes(StandardCharsets.UTF_8);
        //Files.write(file.toPath(), bytesString);

        // Read the contents of the file
        String contents = Files.readString(file.toPath());
        System.out.println("Contents of file: " + contents);

        // Delete the file
        file.delete();

        // Create a new directory
        Path directoryPath = Paths.get("example", "exampledir2");

        try {
            Files.createDirectory(directoryPath);
        } catch (IOException e) {
            //
        }

        // Check if the directory exists
        if (Files.exists(directoryPath)) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Directory does not exist");
        }

        // Create a new file inside the directory
        Path filePath = Paths.get("example", "exampledir2", "example2.txt");

        if (file.exists()) {
            Files.createFile(filePath);
        }

        // Write some data to the file
        Files.writeString(filePath, "Hello, Directory!");

        // Read the contents of the file
        String directoryContents = Files.readString(filePath);
        System.out.println("Contents of file in directory: " + directoryContents);

        // List all files in the directory
        List<Path> directoryContentsList = Files.list(directoryPath).toList();
        System.out.println("Files in directory: " + directoryContentsList);

        // Delete the file and the directory
        Files.delete(filePath);
        Files.delete(directoryPath);
    }

    public static void fileStreams() {
        try {
            // Create a File object
            File file = new File("example.txt");

            // Check if the file exists
            if (!file.exists()) {
                // If the file does not exist, create it
                file.createNewFile();
            }

            // Write to the file using FileOutputStream
            FileOutputStream outputStream = new FileOutputStream(file);
            List<String> contents = List.of("Hello, world!\n", "Hello PAO!");
            contents.stream()
                            .forEach(contentLine -> {
                                try {
                                    outputStream.write(contentLine.getBytes(StandardCharsets.UTF_8));
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            });

            outputStream.close();

            // Read from the file using FileInputStream
            FileInputStream inputStream = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String fileContents = new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);
            inputStream.close();
            System.out.println("File contents: " + fileContents);

            // Read all lines from the file using java.nio
            Path path = Paths.get(file.getPath());
            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
            //System.out.println("Lines from file: " + lines);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}