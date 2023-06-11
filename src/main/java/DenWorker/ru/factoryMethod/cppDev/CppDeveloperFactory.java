package DenWorker.ru.factoryMethod.cppDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;
import DenWorker.ru.factoryMethod.interfaceDevs.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
