package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.banking.BankingTeamFactory;

public class BankingProject {
    public static void main(String[] args) {
        BankingTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.getDeveloper();
        Tester tester = bankingTeamFactory.getTester();
        ProjectManager projectManager = bankingTeamFactory.getProjectManager();

        System.out.println("Banking project team: ");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
