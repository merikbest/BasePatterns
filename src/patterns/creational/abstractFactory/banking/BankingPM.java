package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM managing banking project");
    }
}
