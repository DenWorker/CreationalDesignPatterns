package DenWorker.ru.abstractFactory.projects;

import DenWorker.ru.abstractFactory.interfaceTeam.Developer;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectTeamFactory;
import DenWorker.ru.abstractFactory.interfaceTeam.Tester;
import DenWorker.ru.abstractFactory.websiteTeam.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auctionSiteProject...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
