package DenWorker.ru.abstractFactory.websiteTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Developer;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;
import DenWorker.ru.abstractFactory.interfaceTeam.ProjectTeamFactory;
import DenWorker.ru.abstractFactory.interfaceTeam.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }
}
