package krasi_lecture_examples.other_race_using_RUNNABLE;

public class Mare implements Runnable{

    private String name;


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println( "TheSilver is jumping " + (i+1)*10 + " meters.");
            try {
                Thread.sleep(190);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
