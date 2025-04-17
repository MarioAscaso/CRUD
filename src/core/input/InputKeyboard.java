package core.input;

import java.util.Scanner;

public class InputKeyboard implements InputInterface{

    private Scanner sc = new Scanner(System.in);
    private int intValue;
    private float floatValue;
    private String stringValue;

    private void getInt() {intValue = Integer.parseInt(sc.nextLine());}
    @Override
    public int getIntValue() {
        getInt();
        return intValue;
    }

    private void getFloat() {floatValue = Float.parseFloat(sc.nextLine());}
    @Override
    public float getFloatValue() {
        getFloat();
        return floatValue;
    }

    private void getString() {stringValue = sc.nextLine();}
    @Override
    public String getStringValue() {
        getString();
        return stringValue;
    }
}
