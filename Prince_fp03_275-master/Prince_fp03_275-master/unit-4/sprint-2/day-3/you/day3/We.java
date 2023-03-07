package day3;

public class We {
    public static void main(String[] args) {
        Nest nest1=new Nest();
        nest1.hight=10;
        nest1.color="red";
        Egg eg1=new Egg();
        eg1.size=2;
        eg1.color="green";
        Egg eg2=new Egg();
        eg2.size=3;
        eg2.color="green_prople";
        Egg[] arrofEggs=new Egg[2];
        arrofEggs[0]=eg1;
        arrofEggs[1]=eg2;
        nest1.detail_egg=arrofEggs;
        System.out.println(nest1.detail_egg[1].color);
        
    }
    
}
class Nest{
    int hight;
    String color;
    Egg[] detail_egg=new Egg[2];

}
class Egg{
    int size;
    String color;
}
