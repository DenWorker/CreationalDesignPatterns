package DenWorker.ru.factoryMethod.javaDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code.....");
    }
}
