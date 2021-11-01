package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Some text in english";

        int countGlass = 0;


        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'y') {
                countGlass++;

            }

        }

        char[] glassnie = new char[countGlass];

        int currentIndex = 0;

        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'y') {
                glassnie[currentIndex]=ch;
                currentIndex++;

            }


        }
        System.out.println();
    }
}