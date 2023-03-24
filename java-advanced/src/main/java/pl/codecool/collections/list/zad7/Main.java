package pl.codecool.collections.list.zad7;

public class Main {

    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(5);

        System.out.println("Rozmiar magazynka: " + weaponMagazine.getSize());

        for (int i = 0; i <= weaponMagazine.getSize(); i++) {
            weaponMagazine.loadBullet("Nabój " + i);
//            weaponMagazine.shot();
        }

        weaponMagazine.loadBullet("Nabój 10");

        System.out.println(weaponMagazine.magazine);

        System.out.println("=================");
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
