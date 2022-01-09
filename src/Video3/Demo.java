package Video3;

public class Demo {

    private static int count = 0;

    public static synchronized void incrCount() {
        count++;    //it is locked by synchronized and only one thread can change it.
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000 ; i++) {
//                    count++;   //similar to count= count + 1 thats why we have some problems without synchronize
                    incrCount();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000 ; i++) {
//                    count++;
                    incrCount();
                }
            }
        });
        t1.start();
        t2.start();

        try { //join will wait for thread to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value: " + count);
    }
}
