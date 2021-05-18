package output;

import Utilities.IOUtilities;

import java.util.Arrays;
import java.util.List;

public class ResultsOutput implements Output {

    public void display(List<String> list) {
        String[] strings = new String[list.size()];
        list.toArray(strings);

        IOUtilities.print("==Input string length==" + "\n" + list.get(0).length() + "\n");
        IOUtilities.print("==Number of variants==" + "\n" + list.size() + "\n");
        IOUtilities.print("==List of variants==" + "\n" + Arrays.toString(strings) + "\n");
    }
}
