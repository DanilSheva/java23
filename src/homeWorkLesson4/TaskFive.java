package homeWorkLesson4;

public class TaskFive {
    public static void main(String[] args) {
        // Вывести на консоль каждую первую букву каждого слова

        String text = "It s hard for me to learn programming but I will learn it";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word.charAt(0));


        }

    }
}
