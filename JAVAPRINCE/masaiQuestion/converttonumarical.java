package masaiQuestion;

import java.util.Scanner;

class converttonumarical{
    public static void call(int n){
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ans = new StringBuilder(); 
        for(int i=0;i<numbers.length;i++){
            while(n>=numbers[i]){
                n-=numbers[i];
                ans.append(romanLetters[i]);
            }

            
        }
    
        System.out.println(ans);
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        call(n);
    }
}