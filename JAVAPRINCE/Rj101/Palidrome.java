import java.util.Scanner;

class palidrome{
    public static boolean palidrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void substr(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               boolean b=palidrom(str.substring(i, j));
               if(b){
                System.out.println(str.substring(i, j));
               }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        substr(str1);
    }
}
/*
  String st="abc";
  String st2="abc";
  then Heap not create extry memory here assign a st address in st2;
  but 
  String st3=new String("abc");
  then heap create a extry memory 

 */