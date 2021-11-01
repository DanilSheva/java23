package homeWorkLesson4;

public class TaskFour {
    public static void main(String[] args) {
        //Вывести на консоль только те слова, которые меньше 5ти символов

        String text = "It s hard for me to learn programming but I will learn it ";
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() < 5) {

                System.out.println(word);
            }
        }
    }
}