package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        WebsiteTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer developer = websiteTeamFactory.getDeveloper();
        Tester tester = websiteTeamFactory.getTester();
        ProjectManager projectManager = websiteTeamFactory.getProjectManager();

        System.out.println("Website project team:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
