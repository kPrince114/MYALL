import java.util.Scanner;

/*
 LC='a'+UC-'A';
 UC='A'+uc-'a';
 */
public class ToogeCaseChar {
    public static String toogleanswer(String s){
        StringBuffer sb= new StringBuffer(s);
       
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c>='a' && c<='z'){
                c=(char)('A'+c-'a');
                sb.setCharAt(i, c);
            }
            else if(c>='A' && c<='Z'){
                c= (char)('a'+c-'A');
                sb.setCharAt(i, c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String s=sc.next();
      System.out.println(toogleanswer(s));
    }
}
