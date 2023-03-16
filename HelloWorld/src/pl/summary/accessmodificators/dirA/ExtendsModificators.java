package pl.summary.accessmodificators.dirA;

import pl.summary.accessmodificators.Modificators;

public class ExtendsModificators extends Modificators {

    public static void main(String[] args) {
        ExtendsModificators extendsModificators = new ExtendsModificators();
        System.out.println(extendsModificators.protectedField);
        System.out.println(extendsModificators.publicField);
    }
}
