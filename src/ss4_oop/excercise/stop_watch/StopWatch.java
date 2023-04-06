package ss4_oop.excercise;


public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStart() {
        return System.currentTimeMillis();
    }

    public long getEndTime() {
        return System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStart();
    }

}
