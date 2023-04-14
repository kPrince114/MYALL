package Recusion;

import java.util.Scanner;

public class faconakiseries {
    public static int faconakiseries(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        int small=faconakiseries(n-1)+faconakiseries(n-2);
        return small;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(faconakiseries(n));
        

    }
    
}
