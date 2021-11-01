package lesson11;

public class Main1 {
    public static void main(String[] args) {
        University university = new University();
        Group group1 = new Group("физМат");
        Group group2 = new Group("физкульт");


        Student ivan = new Student("ivan", 32, true);
        Student ira = new Student("ira", 16, false);


        Student ignat = new Student("ignat", 23, true);
        Student igor = new Student("igor", 43, true);
        Student oleg = new Student("oleg", 18, true);

        university.addGroup(group1);
        university.addGroup(group2);

        university.addStudent(ira, "ФизМат");
        university.addStudent(ignat, "ФизМат");
        university.addStudent(igor, "Физкульт");
        university.addStudent(oleg, "История");
        university.addStudent(ivan, "История");

    }
}
