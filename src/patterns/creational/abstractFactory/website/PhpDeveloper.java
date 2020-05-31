package patterns.creational.abstractFactory.website;


import patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer write website php code");
    }
}
