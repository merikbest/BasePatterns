package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write banking java code");
    }
}
