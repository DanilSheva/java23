package homeWorkLesson6;


import java.util.Date;

public class ElectronicMail {

    private String fromWhom;// От кого
    private String toWhom; // Кому
    private String messageSubject; // Тема письма
    private String letter; // Письмо
    private Date sendingTime;

    public String getFromWhom() {
        return fromWhom;
    }

    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }

    public String getToWhom() {
        return toWhom;
    }

    public void setToWhom(String toWhom) {
        this.toWhom = toWhom;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Date getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Date sendingTime) {
        this.sendingTime = sendingTime;
    }

    public void setSendingTime() {
        Date date = new Date();
        setSendingTime(date);

    }

    public void printAllInfo() {
        System.out.print("от кого: "  + this.fromWhom + " Кому: " + this.toWhom + " Тема письма:  "+ this.messageSubject + " Письмо: "  + this.letter + "Дата и Время:" + this.sendingTime);
    }

}

