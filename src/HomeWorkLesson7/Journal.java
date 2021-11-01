package HomeWorkLesson7;

public class Journal extends PrintEdition {
    private int numberPerYear;

    public int getNumberPerYear() {
        return numberPerYear;
    }

    public void setNumberPerYear(int numberPerYear) {
        this.numberPerYear = numberPerYear;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Журнал: " + this.name + ", " + this.year + ", " + this.numberPerYear + ", "+ this.publishingHouse);
    }
}
