package day3;
// import javax.sound.sampled.SourceDataLine;

class first{
    static int s=20;
    int n;//not static (then use new (object)then it make static)
    public static void main(String[] args) {
        System.out.println("prince");
        System.out.println(s);
        // ystem.out.println(n);
        first si=new first();
        System.out.println(si.n);
        

    }
}
