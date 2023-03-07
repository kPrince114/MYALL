// Differentiate between the Thread class and Runnable interface for creating a Thread? with proper example.

// it is a runable example 
/* 
class firstQ implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("i am ruanable method");
            i++;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("i am main class ");
        firstQ demo=new firstQ();
         Thread th=new Thread(demo);
         th.start();
    }
}
*/
/* 
// it is theard example
class firstQ extends Thread {
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("i am ruanable method");
            i++;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("i am main class ");
        firstQ demo=new firstQ();
        demo.start();
    }
}
*/


