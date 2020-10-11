package com.company;

public class Decrypt {
    public static void main(String[] args) {
        String cipher = "jvtwyloluzpisl\"tlzzhnl";

        System.out.println("Our cipher text is: " + cipher);
        System.out.print("Our plain text is: ");

//        int k = 7;
        char[] chars = cipher.toCharArray();
        for (int k=3; k<10; k++) {
            for (char c:chars){
                c -= k;
                System.out.println(c);
            }
        }

}
}
