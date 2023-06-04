package DenWorker.ru.abstractFactory.interfaceTeam;


public interface ProjectTeamFactory {
    Tester getTester();

    ProjectManager getProjectManager();

    Developer getDeveloper();
}
