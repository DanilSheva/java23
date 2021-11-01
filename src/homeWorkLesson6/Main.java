package homeWorkLesson6;

import HomeWorkLesson7.PrintEdition;

public class Main {
    public static void main(String[] args) {
        ElectronicMail incomingMail1 = new ElectronicMail();
        incomingMail1.setFromWhom("Pupa.@mail.ru");
        incomingMail1.setToWhom("Lupa@mail.ru");
        incomingMail1.setMessageSubject("СРОЧНО ОТВЕТЬ!!!!!");
        incomingMail1.setLetter("Как дела???=)))");
        incomingMail1.setSendingTime();

       ElectronicMail [] mails = new ElectronicMail[1];
        mails [0] = incomingMail1;
        for (ElectronicMail mail:mails){
            mail.printAllInfo();


        }
        System.out.println(mails);





    }





}
