package input;

import Utilities.IOUtilities;

public class StringInput implements UserInput {

    public String inputString() {
        return IOUtilities.userData("Enter your value: ");
    }

}
