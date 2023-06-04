package DenWorker.ru.abstractFactory.websiteTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests websiteTeam...");
    }
}
