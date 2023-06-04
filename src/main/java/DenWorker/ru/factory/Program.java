package DenWorker.ru.factory;

import DenWorker.ru.factory.cppDev.CppDeveloperFactory;
import DenWorker.ru.factory.interfaceDevs.Developer;
import DenWorker.ru.factory.interfaceDevs.DeveloperFactory;
import DenWorker.ru.factory.javaDev.JavaDeveloperFactory;
import DenWorker.ru.factory.phpDev.PhpDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown speciaty!");
        }
    }
}
