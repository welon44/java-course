package pl.loops;

public class LoopsExample {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int result = 0;
            result = result + i;

        }

        int[] myArray = new int[10];
        myArray[2] = 10;
        myArray[4] = 12;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("test " + myArray[i]);
        }

        int j = 0;
        for (int number : myArray) {
            j++;
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("Jest to " +  counter + " obrót pętli.");
            counter++;
        }

        counter = 0;
        while (true) {
            System.out.println("Nieskończona pętla while, obrót - " + counter);

            if (counter >= 5) {
                break;
            }
            counter++;
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println("kolejna liczba parzysta " + i);
        }

        do {
            System.out.println("KOd w 'do' wykona się przynajmniej raz");
        } while (false);
    }
}
