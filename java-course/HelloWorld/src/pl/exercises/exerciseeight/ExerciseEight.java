package pl.exercises.exerciseeight;

public class ExerciseEight {
    float calculate(float firstNumber, String action, float secondNumber) {
        float result = 0;

        switch (action) {
            case "+":
                result = firstNumber + secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;

            case "*":
                result = firstNumber * secondNumber;
                break;

            case "/":
                if (secondNumber == 0) {
                    System.out.println("Nie można dzielić przez zero");
                } else {
                    result = firstNumber + secondNumber;
                }
                break;

            default:
                System.out.println("Niedozwolone działanie");

        }

        return result;

    }

}
