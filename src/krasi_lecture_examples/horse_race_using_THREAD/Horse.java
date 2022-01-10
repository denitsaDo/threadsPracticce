package krasi_lecture_examples.horse_race_using_THREAD;

public class Horse extends Thread {
    private String name;
    public Horse (String name) {
        this.name = name;
    }

    public void horseIsRunning () {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + " is running " + (i+1)*10 + " meters.");
        }
    }

    @Override
    public void run() {
        horseIsRunning();
    }
}
