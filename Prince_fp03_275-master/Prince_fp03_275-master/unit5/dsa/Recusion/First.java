
class First{
    public static void main(String[] args) {
       int p=5;
       //main m=new main();
        PrintDec(p);
        Printin(p);
        ap(p*2);
        
    }

    public static void PrintDec(int p) {
        if(p==0){
            return;
        }
        System.out.println(p);
        PrintDec(p-1);
        
    }
    
    public static void ap(int p) {
        if(p==15){
            return;
        }
        System.out.println(p);
        ap(p+1);
        
    }
    
    public static void Printin(int p) {
        if(p==0){
            return;
        }
        Printin(p-1);
        System.out.println(p);
        
    }
}