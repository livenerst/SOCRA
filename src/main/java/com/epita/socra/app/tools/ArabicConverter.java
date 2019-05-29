package com.epita.socra.app.tools;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ArabicConverter implements StringConverter{
    @Override
    public String convert(String number) {

        String[] romans = {"IV","IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M"};
        int[] values = {4, 9, 40, 90, 400, 900, 1, 5, 10, 50, 100, 500, 1000};
        int nb = 0;
        for(int i = 0; i < number.length(); i++) {
            for (int j = 0; j < romans.length; j++) {
                if (number.startsWith(romans[j], i)){
                    nb += values[j];
                    i += romans[j].length() - 1;
                    break;
                }
            }
        }
        return String.valueOf(nb);
    }
}
