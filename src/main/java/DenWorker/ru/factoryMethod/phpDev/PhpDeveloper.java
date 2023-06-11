package DenWorker.ru.factoryMethod.phpDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code....");
    }
}
