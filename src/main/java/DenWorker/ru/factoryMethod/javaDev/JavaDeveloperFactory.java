package DenWorker.ru.factoryMethod.javaDev;

import DenWorker.ru.factoryMethod.interfaceDevs.Developer;
import DenWorker.ru.factoryMethod.interfaceDevs.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
