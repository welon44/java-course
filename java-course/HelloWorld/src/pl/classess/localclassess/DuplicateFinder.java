package pl.classess.localclassess;

public class DuplicateFinder {
    public void findDuplicates(int[] numbers) {

        class Pair {
            int key;
            int value;

            public Pair(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
        
        Pair[] occurrences = new Pair[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int counter = 1;
            for (int j = 0; j < occurrences.length; j++) {
                if (occurrences[j] != null && numbers[i] == occurrences[j].key) {
                    occurrences[j].value += 1;
                    counter++;
                    break;
                }
            }

            if (counter == 1) {
                for (int k = 0; k < occurrences.length; k++) {
                    if (occurrences[k] == null) {
                        occurrences[k] = new Pair(numbers[i], 1);
                        break;
                    }

                }
            }
        }

        for (Pair pair : occurrences) {
            if (pair != null) {
                System.out.printf("( key:%d -> value:%d", pair.key, pair.value);
            }
        }
    }
}
