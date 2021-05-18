import BL.DotsDotsDots;
import Utilities.IOUtilities;
import Validator.StringValidator;
import input.UserInput;
import output.Output;

import java.util.ArrayList;
import java.util.List;

class RunApp {
    private StringValidator validator;
    private UserInput input;
    private DotsDotsDots dotsDotsDots;
    private Output output;
    private List<String> finalList = new ArrayList<String>();


    RunApp(StringValidator validator, UserInput input, DotsDotsDots dotsDotsDots, Output output) {
        this.validator = validator;
        this.input = input;
        this.dotsDotsDots = dotsDotsDots;
        this.output = output;
    }

    void runApplication() {
        try {
            String userString = input.inputString();
            String stringToBeDotted = validator.validateString(userString);
            finalList = dotsDotsDots.getTheListOfDottedWords(stringToBeDotted);
        } catch (NullPointerException n) {
            IOUtilities.Nullpointer();
            this.runApplication();

        } catch (IllegalArgumentException i) {
            IOUtilities.IllegalArgument();
            this.runApplication();
        }

        output.display(finalList);
    }
}
