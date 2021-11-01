package lesson9;

public abstract class  AbctEmployer implements Employer{
   private  int age;
   private String fullName;
   private int money;



    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
