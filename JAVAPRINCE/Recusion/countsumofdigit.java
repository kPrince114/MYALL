package Recusion;

import java.util.Scanner;

public class countsumofdigit {
    public static int sumof(int n){
        if(n==0){
            return 0;
        }
        int sum=n%10;
        return sum+sumof(n/10);
    }
    public static int countEven(int num) {
        int c=0;
        int sum=0;
        for(int i=num;i>=2;i--){
             sum=sumof(i);
             System.out.println(sum);
            if(sum%2==0){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println(countEven(p));
    }
}
