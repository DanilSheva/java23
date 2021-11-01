package homeWorkLesson4;

public class TaskThree {
    public static void main(String[] args) {
        // Вывести на консоль через букву в каждом слове

        String text = "Its hard for me to learn programming but I will learn it";
        for (int i = 0; i <= text.length() - 1; i += 2) {
            char ch = text.charAt(i);
            System.out.println(ch);

        }


    }
}
