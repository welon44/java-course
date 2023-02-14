package pl.exercises.exercisefour;

public class ExerciseFour {

    void checkIfNumberIsDivisibleByThree(int number) {
        if (!(number % 3 == 0)) {
            System.out.println("Pif");
        } else {
            System.out.println(number);
        }
    }

    void checkIfNumberIsDivisibleBySeven(int number) {
        if (!(number % 7 == 0)) {
            System.out.println("Paf");
        } else {
            System.out.println(number);
        }
    }

    void checkIfNumberIsDivisibleByThreeAndSeven(int number) {
        if ((number % 3 == 0) && (number % 7 == 0)) {
            System.out.println("pif paf");
        } else {
            System.out.println(number);
        }
    }
}
