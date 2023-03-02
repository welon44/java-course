package pl.exercises.zad14;

public class Zad14 {

    void countLetter(char firstLetter, char secondLetter) {
        int differnce = Math.abs(firstLetter - secondLetter) - 1;
        System.out.println("Liczba liter pomiędzy " + firstLetter + " a " + secondLetter + " to " + differnce);
    }
}
