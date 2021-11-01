package lesson6;

public class Main {
    public static void main(String[] args) {
        // формула создания обьекта
        //тип переменной
        // название переменной
        //new и указание типа которое мы создаем

        Contact vasya = new Contact();
        vasya.setEmail("vasya@.com");
        vasya.setPhoneNumber("89871234321");
        vasya.setName("Василий");

        Contact petya = new Contact();
        petya.setEmail("petya@.com");
        petya.setPhoneNumber("89689954321");
        petya.setName("Петя");

        Contact ilya = new Contact();
        ilya.setEmail("ilya@.com");
        ilya.setPhoneNumber("89689954543");
        ilya.setName("Илья");

        Contact ira = new Contact();
        ira.setEmail("ira@.com");
        ira.setPhoneNumber("89768853487");
        ira.setName("Ирина");


        PhoneBook book = new PhoneBook();
        book.addContact(ilya);
        book.addContact(vasya);
        book.addContact(petya);
        book.addContact(ira);

        book.search("995");




    }
}
