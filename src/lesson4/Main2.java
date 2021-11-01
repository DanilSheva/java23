package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "qwerty asdfh zxcvbn";
        text = text.replace('e', '!');
        text= text.replace('a','!');
        text = text.replace('i', '!');
        text= text.replace('u','!');
        System.out.println(text);

    }
}
