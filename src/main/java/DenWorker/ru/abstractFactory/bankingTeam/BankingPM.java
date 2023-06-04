package DenWorker.ru.abstractFactory.bankingTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages bankingTeam project...");
    }
}
