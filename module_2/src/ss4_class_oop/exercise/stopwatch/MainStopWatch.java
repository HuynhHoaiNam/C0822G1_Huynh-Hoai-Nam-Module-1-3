package ss4_class_oop.exercise.stopwatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int sum = 0;
        System.out.print("\n" + "Thời gian bắt đầu: " + stopWatch.start() + "\n");
        for (int i = 0; i < 1000000; i++) {
            sum += 1;
        }
        System.out.print("Thời gian kết thúc: " + stopWatch.stop() + "\n");
        System.out.print("Thời gian chạy: " + stopWatch.getElapsedTime());
    }
}
