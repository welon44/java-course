package pl.exercises.zad8;

public class ValidatorImpl implements Validator {

    @Override
    public void validate(Parcel input) {
        int sum = input.xLength + input.yLength + input.zLength;
        if (sum > 300) {
            System.out.println("Suma " + sum + " większa od 300. Błąd.");
        } else {
            System.out.println("Suma " + sum + " mniejsza bądź równa 300.");
        }

        if (input.xLength > 30) {
            System.out.println("Rozmiar x jest większy od 30");
        } else {
            System.out.println("Rozmiar x mniejszy bądź równy 30");
        }

        if (input.yLength > 30) {
            System.out.println("Rozmiar y jest większy od 30");
        } else {
            System.out.println("Rozmiar y mniejszy bądź równy 30");
        }

        if (input.zLength > 30) {
            System.out.println("Rozmiar z jest większy od 30");
        } else {
            System.out.println("Rozmiar z mniejszy bądź równy 30");
        }

        if (input.weight > 30 && input.isExpress) {
            System.out.println("Waga przekracza 30 dla isExpress");
        } else {
            System.out.println("Waga nie przekracza 30 dla isExpress");
        }

        if (input.weight > 15 && !input.isExpress) {
            System.out.println("Waga przekracza 15 dla !isExpress");
        } else {
            System.out.println("Waga nie przekracza 15 dla !isExpress");
        }
    }
}
