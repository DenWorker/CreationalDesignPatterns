package DenWorker.ru.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super project",
                "Source code = new SourceCode();\n");

        System.out.println(master);

        // Не самый хороший способ:
        Project masterClone1 = (Project) master.copy();
        System.out.println(masterClone1);

        // Такой способ желательнее (через фабрику):
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println(masterClone2);
    }
}
