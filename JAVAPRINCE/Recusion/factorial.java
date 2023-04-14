package Recusion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int small=fact(n-1);
        int big=n*small;
        return big;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    
}
