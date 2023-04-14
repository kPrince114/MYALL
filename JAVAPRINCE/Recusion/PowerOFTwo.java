package Recusion;

import java.util.Scanner;

public class PowerOFTwo {
    public static double powerfo(int n){
        if(n==0){
            return 1;
        }
        /* 
        Double small=Math.pow(2,n-1);
        Double  big=2*small;
        */
        return 2*Math.pow(2,n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(powerfo(n));
        /* 
        System.out.println(1/2);
        System.out.println(3/2);
        */
        System.out.println(5*3/5-2*2);
    }
}
