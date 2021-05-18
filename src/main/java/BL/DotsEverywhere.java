package BL;

import java.util.ArrayList;
import java.util.List;

public class DotsEverywhere implements DotsDotsDots {

    private static List<String> newListOfVariables = new ArrayList<String>();

    public List<String> getTheListOfDottedWords(String input) {
        int len = input.length();
        return compileNewList(input, len - 1);
    }

    private List<String> compileNewList(String s, int p) {

        if (p == 1) {
            newListOfVariables.add(s);
            newListOfVariables.add(s.substring(0, 1) + "." + s.substring(1));
        } else {
            compileNewList(s, p - 1);
            compileNewList(s.substring(0, p) + "." + s.substring(p), p - 1);
        }
        return newListOfVariables;
    }
}

