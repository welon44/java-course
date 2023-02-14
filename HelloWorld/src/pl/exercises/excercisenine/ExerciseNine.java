package pl.exercises.excercisenine;

public class ExerciseNine {

    void drawWave(int number) {

        if (number < 0 ) {
            System.out.println("Liczba musi być dodatnia");
        } else {

            for (int i = 0; i < 4; i++) {
                System.out.println();
                for (int j = 0; j < number; j++) {
                    if (j < i) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
}
