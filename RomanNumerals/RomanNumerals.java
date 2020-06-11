package RomanNumerals;

import java.util.List;

public class RomanNumerals {
    private static final class Mapping {
        final int number;
        final String roman;

        public Mapping(int number, String roman) {
            this.number = number;
            this.roman = roman;
        }
    }

    private static final List<Mapping> MAPPINGS =
            List.of(new Mapping(500, "D"),
                    new Mapping(100, "C"),
                    new Mapping(90, "XC"),
                    new Mapping(50, "L"),
                    new Mapping(40, "XL"),
                    new Mapping(20, "XX"),
                    new Mapping(10, "X"),
                    new Mapping(9, "IX"),
                    new Mapping(5, "V"),
                    new Mapping(4, "IV"),
                    new Mapping(1, "I"));

    public static String convert(int number) {
        for (Mapping mapping : MAPPINGS) {
            if (number >= mapping.number) {
                return mapping.roman + convert(number - mapping.number);
            }
        }
        return "";
    }

    public static int convert_roman(String romanInput) {
        for (Mapping mapping : MAPPINGS) {
            if ((romanInput.length() >= 2) && (romanInput.substring(0, 2).equals(mapping.roman))) {
                return mapping.number + convert_roman(romanInput.substring(2));
            }
            if ((romanInput.length() >= 2) && (romanInput.substring(0, 1)).equals(mapping.roman)) {
                return mapping.number + convert_roman(romanInput.substring(1));
            }
            if (romanInput.equals(mapping.roman))
                return mapping.number;
        }
        return 0;
    }


}
