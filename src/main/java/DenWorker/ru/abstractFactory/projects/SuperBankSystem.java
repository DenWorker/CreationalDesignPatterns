package DenWorker.ru.abstractFactory.projects;

import DenWorker.ru.abstractFactory.bankingTeam.BankingTeamFactory;
import DenWorker.ru.abstractFactory.interfaceTeam.Developer;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectTeamFactory;
import DenWorker.ru.abstractFactory.interfaceTeam.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
