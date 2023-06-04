package DenWorker.ru.abstractFactory.bankingTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests bankingTeam code...");
    }
}
