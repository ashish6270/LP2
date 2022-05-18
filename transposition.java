package dsa_sheet;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class transposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="comman sense is not comman";
        int  c=8;
        int r=4;
        char [][] matrix=new char[r][c];
        char [] carr=s.toCharArray();
        int pointer=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pointer==carr.length-1)break;
                matrix[i][j]=carr[pointer];
                pointer++;
            }
        }
        String ans="";
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(matrix[j][i]=='\u0000')break;
                ans=ans+matrix[j][i];
            }
            System.out.println();
        }
        System.out.println(s);
        System.out.println(ans);


    }
}
