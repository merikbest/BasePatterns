package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.Developer;
import patterns.creational.abstractFactory.ProjectManager;
import patterns.creational.abstractFactory.ProjectTeamFactory;
import patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
