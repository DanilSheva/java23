package lesson6;

public class Contact {
    //характеристики данного типа (поля класса. переменные класса)
    private String name;
    private String email;
    private  String phoneNumber;
    private String pathToImage;


    public void setEmail (String email){

        this.email=email;
    }
    public void setName(String name) {

        this.name = name;
    }

    // Явные входящие параметры и неявные
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }
    public String getName(){
        return this.name;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
