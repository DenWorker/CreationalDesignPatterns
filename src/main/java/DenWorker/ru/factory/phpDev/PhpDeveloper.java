package DenWorker.ru.factory.phpDev;

import DenWorker.ru.factory.interfaceDevs.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code....");
    }
}
