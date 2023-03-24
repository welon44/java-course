package pl.codecool.collections.list.zad7;

import java.util.Deque;
import java.util.LinkedList;

public class WeaponMagazine {

    private final int size;

    Deque<String> magazine = new LinkedList<>();

    public WeaponMagazine(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (magazine.size() > getSize()) {
            System.out.println("Magazynek pełny");
        } else {
            magazine.add(bullet);
        }

    }

    public boolean isLoaded() {
        return !magazine.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            magazine.removeLast();
            System.out.println("Magazynek: " + magazine);
        } else {
            System.out.println("Magazynek pusty");
        }
    }

    public int getSize() {
        return size;
    }
}
