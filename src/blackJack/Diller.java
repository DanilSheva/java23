package blackJack;

public class Diller extends Player{
    @Override
    public boolean needMoreCard() {
        if (countValuesCardsOnHands()>17){
            return false;

        }
        return true;
    }

    @Override
    public boolean isDiller() {
        return true;
    }
}
