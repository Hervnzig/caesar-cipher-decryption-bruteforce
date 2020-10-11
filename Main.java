package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Herve");
        String plain = "comprehensive message";
        char[] characters = plain.toCharArray();

        System.out.println("Our plain text is: " + plain);
        System.out.println("Our cipher text is: ");
        for (char c:characters){
            c+=2;
            System.out.print(c);
        }

    }
}
