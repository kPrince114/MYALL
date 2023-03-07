public class FourQ implements Runnable {
    //  What are the different states of a thread, or what is thread lifecycle?
    //ans:-- if you create a theard and i hava more theard that time if one theard take more time or he some requarement that time cussour move another theard and it's end then you go previous theard and complet.
    
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
            FourQ demo=new FourQ();
             Thread th=new Thread(demo);
             // with run() noraml call
             th.run();
            // with start() it's is theard call;
             th.start();
        }
    }

