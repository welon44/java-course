package pl.exercises.exercisethree;

public class ExerciseThree {
    private int a;
    private int b;
    private int c;

    public ExerciseThree(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calculateDelta() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public void calculateSolution() {
        double delta = calculateDelta();
        if (delta < 0) {
            System.out.println("Delta ujemna, nie ma rozwiązania");
        }
        {
            System.out.println("Delta ok.");
        }
    }
}
