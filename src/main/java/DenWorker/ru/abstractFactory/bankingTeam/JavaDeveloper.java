package DenWorker.ru.abstractFactory.bankingTeam;

import DenWorker.ru.abstractFactory.interfaceTeam.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
