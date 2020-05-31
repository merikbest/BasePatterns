package patterns.creational.abstractFactory.website;

import patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project");
    }
}
