package com.epita.socra.app.tools;

public class RomanConverter implements StringConverter {

    @Override
    public String convert(String number) {
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};
        String[][] tabs = {units, tens, hundreds, thousands};
        if (!number.isEmpty()) {
            int nb = Integer.parseInt(number);
            if (nb <= 0)
                return "";
            StringBuilder roman = new StringBuilder();
            int count = 0;
            while (nb > 0){
                int part = nb % 10;
                nb /= 10;
                roman.insert(0, tabs[count][part]);
                count++;
            }
            return roman.toString();
        }
        else {
            return "";
        }
    }
}
