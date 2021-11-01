package lesson9;

public class IOSEmployer extends AbctEmployer implements Employer {
    @Override
    public void doWork() {
        System.out.println("пишу код");
    }

    @Override
    public void keepSalary() {
        this.setMoney(2000 + this.getMoney());
    }


}
