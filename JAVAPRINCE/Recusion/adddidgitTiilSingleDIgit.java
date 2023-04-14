package Recusion;

import java.util.Scanner;

public class adddidgitTiilSingleDIgit {
    public static int AddTillZero(int n){
        if(n<=9){
            return n;
        }
        int p=sumof(n);
        return AddTillZero(p);
    }
    public static int sumof(int n){
        if(n==0){
            return 0;
        }
        int sum=n%10;
        return sum+sumof(n/10);
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int s=sc.nextInt();
        System.out.println(AddTillZero(s));
    }
}
