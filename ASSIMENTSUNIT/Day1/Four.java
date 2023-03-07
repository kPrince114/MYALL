package day1_ass1.Day1;

public class Four {
    public static int con(String s){
        return Integer.parseInt(s);

    }

    public static void main(String[] args) {
        Four f=new Four();
       int s= f.con("101");
        System.out.println(s);
    }
}
