package DenWorker.ru.factory.phpDev;

import DenWorker.ru.factory.interfaceDevs.Developer;
import DenWorker.ru.factory.interfaceDevs.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
