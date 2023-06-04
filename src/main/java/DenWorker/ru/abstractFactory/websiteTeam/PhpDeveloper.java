package DenWorker.ru.abstractFactory.websiteTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
