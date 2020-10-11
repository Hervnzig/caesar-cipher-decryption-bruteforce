package com.company;

public class Answer_2 {

    public static void main(String[] args) {
        String text = "We alescuwmtbel uoi ha coryld choti lnaiem t, iplr!eyfpe";

        int key = 3;
        System.out.println(decryption(text, key));
    }

    public static String decryption(String text, int key) {
        String decrypted = "";

        boolean status = false;
        int j = 0;
        int row = key;
        int col = text.length();
        char[][] mat = new char[row][col];

        for (int i=0; i< col; i++){
            if (j==0 || j== key-1){
                status =  !status;

                mat[j][i] = 'x';
                if (status)
                    j++;
                else
                    j--;

            }
        }

        int index = 0;
        for (int i=0; i<row; i++){
            for (int k=0; k<col; k++){
                if (mat[i][k] == 'x' && index < col){
                    mat[i][k] = text.charAt(index++);
                }
            }
        }

        System.out.println("Our elements arranged in rows and columns diagonally: ");
        System.out.println("--------------------------------------------------------");

        for (int i=0; i<row; i++){
            for (int k=0; k<col; k++){
                System.out.print(mat[i][k]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Our elements after combining them back diagnoally: ");
        System.out.println("--------------------------------------------------------");
        for (int i=0; i<row; i++){
            for (int k=0; k<col; k++){
                if (mat[i][k] != 0){
                    decrypted += mat[i][k];
                }
            }
            System.out.println();
        }


        return decrypted;
    }

}
