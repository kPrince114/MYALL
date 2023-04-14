import java.util.Scanner;

public class ASDiff {
    public static String diffascy(String s){
        StringBuffer sb= new StringBuffer();
        // sb.setCharAt(0, s.charAt(0));
        
        for(int i=0;i<s.length()-1;i++){
            int diff=s.charAt(i+1)-s.charAt(i);
            sb.append(s.charAt(i));
            sb.append(diff);
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      String s=sc.next();
      System.out.println(diffascy(s));
    }
}
