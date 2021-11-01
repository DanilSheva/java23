package blackJack;

import java.util.Scanner;

public class Player implements IPlayer {
    private boolean inGame = true;
    private ICard[] cardsHand = new ICard[100];

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public boolean isDiller() {
        return false;
    }

    public ICard[] getCardsHand() {
        return cardsHand;
    }

    public void setCardsHand(ICard[] cardsHand) {
        this.cardsHand = cardsHand;
    }

    @Override
    public void takeCard(ICard card) {
        for (int i = 0; i < cardsHand.length; i++) {
            if (cardsHand[i] == null) {
                cardsHand[i] = card;
                break;


            }

        }

    }

    @Override
    public int countValuesCardsOnHands() {
        int summe = 0;
        for (ICard currentCard:cardsHand) {
            if (currentCard != null)
                summe = summe + currentCard.getValue();

        }
        return summe;
    }

    @Override
    public boolean needMoreCard() {
        System.out.println("---------Ваши карты");
        showHand();
        System.out.println("Нужна ли вам еще одна карта");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")){
            return true;

        }
        return false;
    }

    @Override
    public void showHand() {
        for (ICard currentCard :cardsHand) {
            if (currentCard!=null){
                currentCard.show();

            }

        }

    }
}
