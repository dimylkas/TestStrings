package com.globallogic.strings;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";

        int a = myStr.indexOf("a");
        System.out.println("indexOf a =" + a);

        int b = myStr.lastIndexOf("b");
        System.out.println("lastIndexOf b =" + b);

        String sub = myStr.substring(3, 6);
        System.out.println("substring 3 - 6 =" + sub);

        String reverse = reverseString(myStr);
        System.out.println("reverseString =" + reverse);


        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        String r = compareStringChars(myStr1, myStr2);
        System.out.println("compareStringChars =" + r);

        String st = "Using methods of class String";
        char[] chstr = uniqueChars(st);
        for (char c : chstr) {
            System.out.println("uniqueChars = " + c);
        }

    }

    static String reverseString(String str) {
        StringBuilder strStringBuilder = new StringBuilder(str);

        return strStringBuilder.reverse().toString();
    }

    static String compareStringChars(String str1, String str2) {
        String[] splitedStr1 = str1.split("");
        StringBuilder strStringBuilder = new StringBuilder();

        for (String s : splitedStr1) {
            if (!str2.contains(s)) {
                strStringBuilder.append(s);
            }
        }

        return strStringBuilder.toString();
    }

    static char[] uniqueChars(String s) {
        StringBuilder strStringBuilder = new StringBuilder();
        String[] splitedStr1 = s.split("");

        for (String sf : splitedStr1) {
            if (strStringBuilder.indexOf(sf) == -1) {
                strStringBuilder.append(sf);
            }
        }

        return strStringBuilder.toString().toCharArray();
//        char[] charArray = new char[strStringBuilder.length()];
//        strStringBuilder.getChars(0, strStringBuilder.length(), charArray, 0);
//        return charArray;
    }


}
