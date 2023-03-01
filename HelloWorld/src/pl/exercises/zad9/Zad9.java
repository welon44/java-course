package pl.exercises.zad9;

public class Zad9 {

    void initWave(int waveLength) {
        int waveHeight = 4;
        int x = waveHeight - 1;

        if (waveLength <= 0 ) {
            showError();
        } else {
            drawWave(waveHeight, waveLength, x);
        }
    }

    void showError() {
        System.out.println("Liczba musi być dodatnia");
    }

    void drawWave(int waveHeight, int waveLength, int waveHeightIndex) {
        for (int i = 0; i < waveHeight; i++) {
            for (int j = 0; j < waveHeight * waveLength * 2; j++) {
                if (j % (waveHeight * 2) == waveHeightIndex || j % (waveHeight * 2) == waveHeight + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            waveHeightIndex--;
            System.out.println();
        }
    }
}
