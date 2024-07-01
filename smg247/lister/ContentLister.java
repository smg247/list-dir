package smg247.lister;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ContentLister {

    // Returns the directories contents in a list
    public static ArrayList<String> getContentsOfDir(String path) {
        ArrayList<String> contents = new ArrayList<>(List.of(new File(path).list()));

        for (String content : contents) {
            System.out.println(content);
        }
        return contents;
    }

    // Writes the elements in contents to the "contents.txt" file in separate lines including line number
    public static void writeContents(List<String> c) {
        try {
            boolean append = true;
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("contents.txt", append)));
            int i = 0;
            for (String content : c) {
                out.println(i + ": " + content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
