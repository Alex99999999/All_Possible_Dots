import BL.DotsDotsDots;
import BL.DotsEverywhere;
import Validator.StringValidator;
import Validator.Validator;
import input.StringInput;
import input.UserInput;
import output.Output;
import output.ResultsOutput;

public class Main {
    public static void main(String[] args) {

        DotsDotsDots dotsDotsDots  = new DotsEverywhere();
        UserInput userInput = new StringInput();
        StringValidator stringValidator = new Validator();
        Output output = new ResultsOutput();

        RunApp runApp = new RunApp(stringValidator, userInput, dotsDotsDots, output);

        runApp.runApplication();


    }
}
