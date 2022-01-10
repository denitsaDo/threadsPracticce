package Video2.Lesson3;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getId() +" ; Value : " +i);
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });
        t1.start();
    }
}
