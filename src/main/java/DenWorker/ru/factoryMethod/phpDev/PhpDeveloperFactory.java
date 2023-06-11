package DenWorker.ru.factoryMethod.phpDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;
import DenWorker.ru.factoryMethod.interfaceDevs.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
