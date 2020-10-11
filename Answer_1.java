package com.company;

public class Answer_1 {
    public static void main(String[] args) {
        String cipher = "jvtwyloluzpisl\"tlzzhnl";

        System.out.println("-- Our cipher text is: " + cipher);

        char[] chars = cipher.toCharArray();
        for (int k=3; k<10; k++) {
            System.out.print("\n\n|| Our plain text is --- using key: " + k + "\n");
            for (char c:chars){
                c -= k;
//                System.out.print(c);
                System.out.print(c);
            }

        }

//        int k = 7;
//        char[] chars = cipher.toCharArray();
//        for (char c:chars){
//            c -= k;
//            System.out.print(c);
//            decryptedMessage += c;
//        }


}
}
