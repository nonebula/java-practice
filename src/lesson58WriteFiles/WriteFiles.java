package lesson58WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {

        //How to write a file using Java (4 popular options)
            // FileWriter = good for small or medium-sized text files - THIS EXAMPLE
            // BufferedWriter = Better performance for large amounts of text
            // PrintWriter = Best for structured data, like reports or logs
            // FileOutput Stream = Best for binary files (e.g. images, audio files)

//        String filePath = ... File path could be defined here

        //unpredictable so should be wrapped in a try block
        try(FileWriter writer = new FileWriter("test.txt")) { //filePath could be passed as a parameter here (for cleanliness, best practice)
            // no path = default root location. Could paste a file path here, likely using double // instead of / because Java interprets this as an escape command
            writer.write("I like pizza...\nIt's reeaalllyy gooood!");
            //Could also pass the text content as a variable too. Multiline string using """ """ (e.g. below)
            System.out.println("File has been written");
        } catch(FileNotFoundException e) {
            System.out.println("Could not find file location");
        } catch(IOException e) { //input/output exceptions
            System.out.println("Could not write file");
        }

        /*
        String textContent = """
                Once there was a pizza, 
                the pizza said 'ohh schmiza!'
                he jumped up and down,
                with a big frown
                """;
         */

    }
}
