package homeWorkLesson4;

public class TaskTwo {
    public static void main(String[] args) {
        // Вывести на консоль сумму согласных букв

        String word = "It's hard for me to learn programming but I will learn it";
        String vowels = word.replaceAll("(?i)[^aeiouy]+", "");
        int numVowels = vowels.length();
        int numConsonants = word.length() - numVowels;
        System.out.println(numConsonants);

    }
}
