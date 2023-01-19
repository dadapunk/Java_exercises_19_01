package org.example;

public class StringHelper {

    public static String reverse(String word) {
        if (word==null || word.isEmpty()){
            throw new IllegalArgumentException();
        }
        String reverseWord="";
        for (int i = word.length(); i > 0; i--) {
            reverseWord += word.charAt(i - 1);
        }
        return reverseWord;
    }
    public static String encoder(String input) {
        input = input.replaceAll("a", "1");
        input = input.replaceAll("e", "2");
        input = input.replaceAll("i", "3");
        input = input.replaceAll("o", "4");
        input = input.replaceAll("u", "5");
        return input;
    }
}
