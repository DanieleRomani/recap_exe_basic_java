package it.Java_Advance.Java_A.Exe_25_Reading_and_Writing_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exe_25_Reading_and_Writing_4 {
    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) throws IOException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file.txt
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;
        try {
            Files.deleteIfExists(MY_PATH);
            Files.createFile(MY_PATH);
            // Your code here
            Files.writeString(MY_PATH, myString);
            System.out.println(Files.readString(MY_PATH));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            // System.exit(0);  WTF GREG
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            System.out.println(Files.readAllLines(MY_PATH));

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() throws IOException {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split
        // Your code here
        try {
            List<String> lines = Files.readAllLines(Paths.get(MY_PATH.toUri()));
            int numLines = lines.size();
            System.out.println("Number of lines: " + numLines);

        } catch (IOException exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }


    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     * <p>
     * Then deletes the previous file with Files.delete() use inside the try block
     */
    private static void exercise4() throws IOException {
        System.out.println("\nExercise 4: ");
        try {
            String content = Files.readString(MY_PATH);
            String[] words = content.split("\\s+");
            int count = words.length;

            System.out.println("Number of words: " + count)
;
            Files.delete(MY_PATH); // delete my file txt
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            // Your code
            if (!Files.exists(myDirectoryPath)) {                // se la directory non esiste crea la directory (Path)
                Files.createDirectory(myDirectoryPath);
            }
            //Path myFilePath = myDirectoryPath.resolve("myfile.txt");           // resolve ricrea il percorso.
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");    // (myFilePath)
            System.out.println(Files.readString(PATH_IN_A_FOLDER));

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
// Pair whith Valerio Corallini and Marco Astesana

}