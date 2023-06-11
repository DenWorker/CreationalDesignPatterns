package DenWorker.ru.factoryMethod.cppDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code.....");
    }
}
