package ss4_class_oop.exercise.stopwatch;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        long pastTime = endTime - startTime;
        return pastTime;
    }
}


