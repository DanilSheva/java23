package lesson9;

public class QA extends AbctEmployer implements Employer{
    @Override
    public void doWork() {
        System.out.println("ищу баги");
    }

    @Override
    public void keepSalary() {
        this.setMoney(this.getMoney()+1500);

    }
}
