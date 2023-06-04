package DenWorker.ru.factory.cppDev;

import DenWorker.ru.factory.interfaceDevs.Developer;
import DenWorker.ru.factory.interfaceDevs.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
