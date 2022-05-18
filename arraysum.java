package dsa_sheet;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(reduction(arr));
    }
    public  static  int reduction(int []arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        int ans=0;
        for(int i=1;i<arr.length;i++)ans+=arr[i];
        return ans;
    }
}
