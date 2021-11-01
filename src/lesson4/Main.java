package lesson4;

public class Main {
    public static void main(String[] args) {
        String email = "iergegrerjgf@mail.ru";

        int indexOfDog = email.indexOf("@");
        if (indexOfDog == - 1){
            System.out.println("Email не содержит собаки");
            return;
        }
        String [] partsByDog =  email.split("@");
        if (partsByDog.length !=2 ){
            System.out.println("Email содержит собак больше чем нужно");
            return;

        }

        String partBeforeDog = partsByDog [0];
        String partAfterDog = partsByDog [1];

        if (partBeforeDog.startsWith(".") || partBeforeDog.endsWith(".")){
            System.out.println("Email не подходит начинается или заканчивается на точку");
            return;

        }
        if (partAfterDog.startsWith(".")||partAfterDog.endsWith(".")){
            System.out.println("Email не подходит начинается или заканчивается на точку");
            return;
        }




    }
}
