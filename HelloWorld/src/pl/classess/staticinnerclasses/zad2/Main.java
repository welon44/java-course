package pl.classess.staticinnerclasses.zad2;

public class Main {
    public static void main(String[] args) {
        MyUtils.StringUtils stringUtils = new MyUtils.StringUtils();

        System.out.println(stringUtils.reverseString());
        System.out.println(stringUtils.convertStringToUppercase());
        System.out.println(stringUtils.convertStringToLowercase());

    }
}
