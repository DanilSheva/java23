package blackJack;

public interface IPlayer {

    void  takeCard(ICard card);

    int countValuesCardsOnHands();

    boolean needMoreCard();

    void showHand();


  boolean isInGame();

  void setInGame (boolean inGame);

  boolean isDiller();





}
