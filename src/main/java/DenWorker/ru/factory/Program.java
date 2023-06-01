package DenWorker.ru.factory;

public class Program {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeJavaCode();

        CppDeveloper CppDeveloper = new CppDeveloper();
        CppDeveloper.writeCppCode();
    }
}
