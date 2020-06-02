package patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer1 = new JavaDeveloper();
        //ИЛИ
        Developer developer2 = new SeniorJavaDeveloper(new JavaDeveloper());
        //ИЛИ
        Developer developer3 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
    }
}
