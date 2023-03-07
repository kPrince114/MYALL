public class command {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int num=Integer.parseInt(args[0]);
        int pro=1;
        if(num==0&&num==1){
            System.out.println(pro);
        }
        else{
            for(int i=1;i<=num;i++){
                pro=pro*i;
            }
            System.out.println(pro);
        }
        
    }
    
}
