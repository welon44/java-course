package pl.obiektowosc.zad16;

public enum Runner {

    BEGINNER(301, 500),
    INTERMEDIATE(151, 300),
    ADVANCED(120, 150);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    static Runner getFitnessLevel(int time) {
        Runner runnerLevel = null;

        for(Runner runner : Runner.values()) {
            if (time >= runner.minTime && time <= runner.maxTime) {
                runnerLevel = runner;
            }
        }

        return runnerLevel;
    }
}
