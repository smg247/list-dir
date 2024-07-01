package smg247.lister;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> contents = ContentLister.getContentsOfDir("/Users/sgoeddel/Projects/ci-tools");
        ContentLister.writeContents(contents);
    }
}
