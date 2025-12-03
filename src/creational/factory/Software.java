package creational.factory;

public class Software {
    public static void main(String[] args) {
        var developerFactory = createDeveloperFactoryByLanguage(ProgrammingLanguage.JAVA);
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}