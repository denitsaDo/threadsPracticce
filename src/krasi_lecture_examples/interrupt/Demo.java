package krasi_lecture_examples.interrupt;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Runnable r = () -> {
            System.out.println("Go to sleep.");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("--Shhh, who woke me up?");
            }
            System.out.println("Wake up.");
        };

        Thread t = new Thread(r);
        t.start();
        Thread.sleep(3000); // tekushtata nishka
        System.out.println("--I am not going to wait for you!");
        t.interrupt();  // get you out of blocking stage. You cannot interrupt a thread, which is runnign

    }
}
