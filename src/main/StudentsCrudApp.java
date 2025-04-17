package main;

import core.input.InputInterface;
import core.input.InputKeyboard;
import core.output.OutputInterface;
import core.output.OutputScreen;
import core.validator.Validator;
import studentsManager.*;

public class StudentsCrudApp {

    public static final int REGISTER = 1;
    public static final int LIST = 2;
    public static final int DELETE = 3;
    public static final int MODIFY = 4;
    public static final int SEARCH = 5;
    public static final int EXIT = 6;

    public static OutputInterface outputInterface;
    public static InputInterface inputInterface;
    private static StudentsManager studentsManager;

    public static void main(String[] args) {
        outputInterface = new OutputScreen();
        inputInterface = new InputKeyboard();
        studentsManager = new StudentsManager();

        int optionMenu;

        do {
            do {
                outputInterface.showMenu();
                optionMenu = inputInterface.getIntValue();
            }while(!Validator.isOptionMenuValid(optionMenu));
            doOption(optionMenu);
        }while(optionMenu != EXIT);

    }

    private static void doOption(int optionMenu) {
        switch (optionMenu) {
            case REGISTER -> {
                studentsManager.registerNewStudent();
            }
            case LIST -> {
                studentsManager.listStudents();
            }
            case DELETE -> {
                studentsManager.deleteStudent();
            }
            case MODIFY -> {
                studentsManager.modifyMark();
            }
            case SEARCH -> {
                studentsManager.searchStudent();
            }
            case EXIT -> {
                outputInterface.sessionExit();
            }
        }
    }
}
