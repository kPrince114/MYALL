package Recusion;

import java.util.Scanner;

public class Sum_of_Digits_of_String_After_Convert {
    public static int sumof(int n){
        if(n==0){
            return 0;
        }
        int sum=n%10;
        return sum+sumof(n/10);
    }
    public static int ans2(int k,int n){
        if(k-1==0){
            return n;
        }
        int p=sumof(n);
        return ans2(k-1,p);
    }
    public static int ans(String s,int k){

        StringBuffer sb = new StringBuffer();
        
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            sb.append(ch-'a'+1);
        }
        int sum=0;
        String[] arr=sb.toString().split("");
        for(int i=0;i<arr.length;i++){
            sum=sum+Integer.parseInt(arr[i]);
        }

        int p=ans2(k,sum);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        System.out.println(ans(s,k));
       
    }
}
