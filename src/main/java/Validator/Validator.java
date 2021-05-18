package Validator;

import java.util.ArrayList;
import java.util.List;

public class Validator implements StringValidator {

    public String validateString(String str) {
        ValidateStringNotNull(str);
        ValidateStringContainsNoSpaces(str);
        return str;
    }

    private void ValidateStringNotNull(String str) throws NullPointerException {
        if (str == null || str.isEmpty() || str.length() <= 1) {
            throw new NullPointerException();
        }
    }

    private void ValidateStringContainsNoSpaces(String str) throws IllegalArgumentException {
        if (str.contains(" ")) {
            throw new IllegalArgumentException();
        }
    }
}
