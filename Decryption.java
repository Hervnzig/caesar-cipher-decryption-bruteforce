package com.company;

import java.util.Scanner;

public class other_code_from_github {

    public static void main(String[] args) {
        other_code_from_github c = new other_code_from_github();
        Scanner s = new Scanner(System.in);
        System.out.println("input Data to encypt:");
        String str = s.nextLine();
        System.out.println("Input the key:");
        int key = s.nextInt();
        String encrypted = c.encrypt(str, key);
        System.out.println("Encrypted Data:" + encrypted);
        String decrypted = c.decrypt(str, key);
        System.out.println("Decrypted Data:" + decrypted);

    }

    String encrypt(String str, int key) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (key % 26);
                if (c > 'Z') {
                    c = c - 26;
                }
            } else if (Character.isLowerCase(c)) {
                c = c + (key % 26);
                if (c > 'z') {
                    c = c - 26;
                }
            }
            encrypted += (char) c;
        }
        return encrypted;
    }

    String decrypt(String str, int key) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c - (key % 26);
                if (c < 'A') {
                    c = c + 26;
                }
            } else if (Character.isLowerCase(c)) {
                c = c - (key % 26);
                if (c < 'a') {
                    c = c + 26;
                }
            }
            decrypted += (char) c;
        }
        return decrypted;
    }

}
