package fronzen_b.backend;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = Monitor.getInstance();
        monitor.startMonitoring();
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long time_run = 0;
        while (time_run<= 6000){
            end = System.currentTimeMillis();
            time_run = end-start;
        }
        monitor.endMonitoring();

        start = System.currentTimeMillis();
        monitor.startMonitoring();
        time_run = 0;
        while (time_run <= 7000){
            end = System.currentTimeMillis();
            time_run = end-start;
        }
        monitor.endMonitoring();
    }
}