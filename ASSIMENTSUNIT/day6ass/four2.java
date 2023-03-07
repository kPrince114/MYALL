package day6ass;
// synchronized block:-- it use in some part of theard or particular block in thead use in synchronized method
class fir extends Thread {
    int pro=5;
    public  void run() {
        synchronized(this){
            for (int i = 1; i <=10; i++) {
                System.out.println(" five "+ i+ " ja "+pro*i);
            }
        }
    }
    
}
 
class four2{
    public static void main(String[] args) throws InterruptedException {
        fir f1=new fir();
        f1.start();
        //System.out.println(f1.pro);

    }

}