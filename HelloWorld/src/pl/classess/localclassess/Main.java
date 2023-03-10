package pl.classess.localclassess;

public class Main {
    public static void main(String[] args) {
        DuplicateFinder duplicateFinder = new DuplicateFinder();

        int[] numbers = {1, 2,3,1,5,-10, 54, -17};
        duplicateFinder.findDuplicates(numbers);
    }
}
