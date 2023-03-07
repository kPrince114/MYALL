package ass4;
//What is the Difference between the sleep and join method explain with one example:--

// sleep:-- There is a static method by name sleep(long ms) inside the Thread class which takes time in milliseconds as an argument ex:-theard.sleep(1000); 

// join:-- If we want to suspend a running thread conditionally then we should use join() method of the Thread class. join() method is a non-static method. ex:- theard.join();
class third implements Runnable {
    @Override
    /* 
    // use in sleep methd 
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside run " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end of run()...");
    }
    */
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside run " + i);
        }
        System.out.println("end of run()...");
    }

    public static void main(String[] args) throws Exception {
        third job = new third();
        Thread t1 = new Thread(job);
        t1.start();
        // use in join method 
        t1.join();
        for(int i=0;i<5;i++)
        {
            System.out.println("main method is running ");
        }
        System.out.println("end of main()...");
    }
}