package blackJack;

public class Card implements ICard {
    private int value;
    private String name;

    public Card() {
    }

    public Card( String name,int value) {
        this.value = value;
        this.name = name;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void show() {
        System.out.println(name);

    }
}
