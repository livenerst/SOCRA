package com.epita.socra.app.tools;

public class Adder implements StringConverter{

    private int sum = 0;
    @Override
    public String convert(String number) {
        String toAdd = number;
        StringConverter converter;
        if (!Character.isDigit(toAdd.charAt(0))){
            converter = new ArabicConverter();
            toAdd = converter.convert(toAdd);
        }
        sum += Integer.parseInt(toAdd);
        return String.valueOf(sum);
    }
}
