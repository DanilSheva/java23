package blackJack;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();
        IPlayer player1 = new Player();
        IPlayer player2 = new Player();
        IPlayer player3 = new Player();
        Diller diller = new Diller();


        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(player3);
        blackJack.addPlayer(diller);

        blackJack.diveTwoCards();

        blackJack.giveOtherCardsIfNeed();
        System.out.println();

    }
}
