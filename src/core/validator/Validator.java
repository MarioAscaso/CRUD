package core.validator;

import main.StudentsCrudApp;

public class Validator {

    public static boolean isOptionMenuValid(int optionMenu) {
        return optionMenu >= StudentsCrudApp.REGISTER && optionMenu <= StudentsCrudApp.EXIT;
    }

}
