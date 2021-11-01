package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int mark= 4;

        switch (mark){
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Так себе");
                break;
            case 2:
                System.out.println("Иди учи");
                break;
            default:
                System.out.println("Это не оценка");
        }
    }
}
