package Recusion;

import java.util.Scanner;

class sumofdigit{
    public static int sumof(int n){
        if(n==0){
            return 0;
        }
        int sum=n%10;
        return sum+sumof(n/10);
    }
    public static int productof(int n){
        if(n==0){
            return 1;
        }
        return n%10*productof(n/10);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumof(n));


    }
}