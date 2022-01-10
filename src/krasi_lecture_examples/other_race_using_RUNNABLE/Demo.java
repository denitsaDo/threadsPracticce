package krasi_lecture_examples.other_race_using_RUNNABLE;

public class Demo {
    public static void main(String[] args) {

        Horse zvezda = new Horse("Star");
        Horse alexanderMakedonski = new Horse("Bucephalus");

        Thread threadKobila = new Thread(new Mare());

        zvezda.start();
        alexanderMakedonski.start();
        threadKobila.start();

        Runnable fan = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(" -Come on, Star!");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(fan).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(" -Hurry up, Silver");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        while (threadKobila.isAlive()) {

        }
        System.out.println("---END OF RACE---");
    }


}
