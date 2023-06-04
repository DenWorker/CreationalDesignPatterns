package DenWorker.ru.abstractFactory.bankingTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Developer;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectTeamFactory;
import DenWorker.ru.abstractFactory.interfaceTeam.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
