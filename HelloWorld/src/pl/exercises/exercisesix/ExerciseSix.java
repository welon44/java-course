package pl.exercises.exercisesix;

public class ExerciseSix {

    void sumUlamki(int number) {
        float wynik = 0;

        if (number > 1000000 || number <= 0) {
            return;
        }

        for (int i = 1; i <= number; i++) {
            wynik += (1.0/i);
        }

        System.out.println(wynik);
    }
}
