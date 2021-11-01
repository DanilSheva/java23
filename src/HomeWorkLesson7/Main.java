package HomeWorkLesson7;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Мастер и Маргарита");
        book1.setYear(1967);
        book1.setPublishingHouse("Москва");
        book1.setAuthor("Михаил Афанасьевич Булгаков");
        book1.setCountOfPages(496);

        Book book2 = new Book();
        book2.setName("Сильмариллион");
        book2.setYear(1977);
        book2.setPublishingHouse("ACT");
        book2.setAuthor("Джон Рональд Руэл Толкин");
        book2.setCountOfPages(448);

        Book book3 = new Book();
        book3.setName("Хоббит, или Туда и обратно");
        book3.setYear(1937);
        book3.setPublishingHouse("George Allen & Unwin");
        book3.setAuthor("Джон Рональд Руэл Толкин");
        book3.setCountOfPages(208);

        Journal journal1 = new Journal();
        journal1.setName("Мурзилка");
        journal1.setYear(1924);
        journal1.setPublishingHouse("Мурзилка");
        journal1.setNumberPerYear(1);

        Journal journal2 = new Journal();
        journal2.setName("Playboy");
        journal2.setYear(1953);
        journal2.setPublishingHouse("Playboy Enterprises");
        journal2.setNumberPerYear(1);

        PrintEdition[] print = new PrintEdition[5];
        print [0] = book1;
        print [1] = book2;
        print [2] = book3;
        print [3] = journal1;
        print [4] = journal2;

        for (PrintEdition edition:print){
            edition.printAllInfo(); // полиморфизм
        }

        PrintEditionService.printBigBook(print);


    }
}
