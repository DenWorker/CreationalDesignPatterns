package DenWorker.ru.factory.javaDev;

import DenWorker.ru.factory.interfaceDevs.Developer;
import DenWorker.ru.factory.interfaceDevs.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
