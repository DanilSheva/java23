package blackJack;

public interface IGame {

    void  diveTwoCards();

    void giveOtherCardsIfNeed();

    void addPlayer(IPlayer player);

    void printWinner();

    int countPlayersInGame();



}
