package krasi_lecture_examples.horse_race_using_THREAD;

public class Demo {
    public static void main(String[] args) {
        Horse zvezda = new Horse("Star");
        Horse alexanderTheGreatHorse = new Horse("Bucephalus");

        zvezda.start();
        alexanderTheGreatHorse.start();
        try {
            zvezda.join();
            alexanderTheGreatHorse.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("---End of race---"); // main thread
    }


}
