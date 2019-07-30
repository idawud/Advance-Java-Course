package org.glblcd.day2;

public enum PrimaryColour {
    RED (0xff0),
    BLUE(0xaf0),
    GREEN(0xb50);


    private final int hexValue;

    PrimaryColour(int i) {
        hexValue = i;
    }

    public int getHexValue(){
        return hexValue;
    }
}
