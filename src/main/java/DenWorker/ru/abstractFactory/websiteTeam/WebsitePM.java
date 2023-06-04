package DenWorker.ru.abstractFactory.websiteTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
