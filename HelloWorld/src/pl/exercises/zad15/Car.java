package pl.exercises.zad15;

public enum Car {

    FERRARI(1000, 1),
    PORSCHE(2000, 2),
    MERCEDES(3000, 3),
    BMW(4000, 4),
    OPEL(5000, 5),
    FIAT(6000, 6),
    TOYOTA(7000, 7);

    private final int prize;
    private final int power;

    Car(int prize, int power) {
        this.prize = prize;
        this.power = power;
    }

    public boolean isFasterThan(Car car) {
        return this.power > car.power;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isPremium() {
        return this.prize > 5000;
    }

    public int getPrize() {
        return prize;
    }

    public int getPower() {
        return power;
    }
}
