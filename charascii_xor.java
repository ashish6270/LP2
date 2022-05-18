package dsa_sheet;

public class charascii_xor {
    public static void main(String[] args) {
        String s="Hello World";
       String ans="";
       for(char c:s.toCharArray()){
           int n=(c^127);
           if(n>=32&&n<=127){
               ans=ans+(char)n;
           }
       }
        System.out.println(s);
        System.out.println(ans);
    }
}
