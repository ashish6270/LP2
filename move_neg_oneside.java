package dsa_sheet;

import java.util.Scanner;

public class move_neg_oneside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        movenegative(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public  static  void movenegative(int arr[]){
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                p++;
            }
        }
    }
}
