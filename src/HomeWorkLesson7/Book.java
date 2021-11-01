package HomeWorkLesson7;

public class Book extends PrintEdition {
    private String author;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public void printAllInfo() {
        System.out.println("Книга: " + this.name + ", " + this.author + ", " + this.year + ", " + this.countOfPages + ", " + this.publishingHouse);
    }
}
