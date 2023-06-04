package DenWorker.ru.factory.cppDev;

import DenWorker.ru.factory.interfaceDevs.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code.....");
    }
}
