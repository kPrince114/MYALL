package day1;

public  class meref {
    public static void funx(String name){
        System.out.println("Welcome Methiod reference "+name);
    }
    public static void main(String[] args) {
        meint l1=(n)->System.out.println("welcome"+n);
        l1.sayhello("prince");
        // method reference in java;
        meint reclass=meref::funx;
        reclass.sayhello("rajKumar");
        //if method is non static then :- meint i=new meref()::funx;
    }
}
