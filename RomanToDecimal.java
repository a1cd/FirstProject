/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: RomanToDecimal.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/28 at 10:50 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

import org.jetbrains.annotations.NotNull;

public class RomanToDecimal {
    public static int romanToDecimal(String roman) throws Exception {
        int chars = roman.length();
        // current level (starts at I and ends at M)
        RomanNumerals height = RomanNumerals.I;
        // current numeral count
        int num = 0;
        // reverse list
        for (int i = roman.length()-1; i >= 0; i--) {
            String CurrentChar = roman.substring(i,i+1).toUpperCase();
            RomanNumerals romanNum = RomanNumerals.valueOf(CurrentChar);

            if (height.isLessThan(romanNum)) {
//                if (height.compare())
                num += romanNum.toInt();
                height = romanNum;
            } else {
                num -= romanNum.toInt();
            }
        }
        return num;

    }

    public static void main(String[] args) {
        for (String temp: args) {
            try {
                System.out.println("input: "+temp+" => Output: "+ romanToDecimal(temp));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("input: "+temp+" => Output: "+"invalid");
            }
        }
    }

    public enum RomanNumerals {
        I,
        V,
        X,
        L,
        C,
        D,
        M;
        public int toInt() throws Exception {
            switch (this) {

                case I -> {
                    return 1;
                }
                case V -> {
                    return 5;
                }
                case X -> {
                    return 10;
                }
                case L -> {
                    return 50;
                }
                case C -> {
                    return 100;
                }
                case D -> {
                    return 500;
                }
                case M -> {
                    return 1000;
                }
                default -> throw new Exception();
            }
        }
        public int compare(RomanNumerals other) throws Exception {
            return (this.toInt() - other.toInt());
        }
        public boolean isGreaterThan(RomanNumerals that) throws Exception {
            return this.compare(that) > 0;
        }
        public boolean isLessThan(RomanNumerals that) throws Exception {
            return this.compare(that) <= 0;
        }
    }
}
