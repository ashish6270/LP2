package dsa_sheet;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public  static  void  reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
