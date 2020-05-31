package patterns.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        //Вариант 1
//        DeveloperFactory developerFactory = new CppDeveloperFactory();

        //Вариант 2
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    //Добавляем гибкости в программу
    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " unknown speciality");
        }
    }
}
