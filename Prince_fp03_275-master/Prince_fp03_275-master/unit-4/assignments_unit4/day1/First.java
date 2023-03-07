import java.util.Scanner;
// import java.lang.Math;
class First{
    public static String reversString(String input){
        String s="";
        for(int i=input.length()-1;i>=0;i--){
            char f=input.charAt(i);
            s=s+f;
        }
        return s;
    };
    public static void main(String[] args) {
        //Q1) Write the logic to reverse the String given in the parameter without the help of predefined reverse method and return the reversed String:(HINT use Array)
        System.out.println("prince");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String str = sc.next();
        String result = reversString(str);
        System.out.println(result);
        // System.out.println("Original String is :"+ originalString);
        // System.out.println("Reversed String is :"+ result);
        
    }
}