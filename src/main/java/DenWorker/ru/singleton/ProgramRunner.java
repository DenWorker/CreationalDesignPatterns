package DenWorker.ru.singleton;

public class ProgramRunner {
    public static void main(String[] args) {

        // Здесь будет один и тот же экземпляр класса.
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        // Здесь будет один и тот же экземпляр класса.
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
