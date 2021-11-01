package blackJack;

public class BlackJack implements IGame {
    private IPlayer[] players = new IPlayer[10];
    private IDeck deck = new Deck();


    @Override
    public void diveTwoCards() {
        for (IPlayer player : players) {
            if (player != null) {
                player.takeCard(deck.randomCard());
                player.takeCard(deck.randomCard());

            }

        }

    }

    @Override
    public void giveOtherCardsIfNeed() {
        for (IPlayer player : players) {
            if (player != null) {
                while (player.needMoreCard()) {
                    player.takeCard(deck.randomCard());

                }
            }

        }

    }


    @Override
    public void addPlayer(IPlayer player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;

            }
        }

    }

    @Override
    public void printWinner() {
        for (IPlayer player : players) {
            if (player != null) {
                if (player.countValuesCardsOnHands() > 21) {
                    player.setInGame(false);

                }

            }

        }

        if (countPlayersInGame() == 0) {
            System.out.println("Выиграл крупье");
            for (IPlayer player : players) {
                if (player != null) {
                    if (player.isDiller()) {
                        player.showHand();
                        return;

                    }

                }

            }


        }
        if (countPlayersInGame() == 1) {
            System.out.println("Победитель игрок   ");
            for (IPlayer player : players) {
                if (player != null) {
                    if (player.isInGame()) {
                        player.showHand();
                        return;

                    }

                }
            }

        }

        int winnerValue  = 0;
        for (IPlayer player:players){
            if (player != null){
                if (player.isInGame()){
                    if (winnerValue<player.countValuesCardsOnHands()){
                        winnerValue = player.countValuesCardsOnHands();

                    }

                }

            }

        }
        for (IPlayer player:players) {
            if (player != null) {
                if (player.isInGame()&&!player.isDiller() ){
                    if (player.countValuesCardsOnHands() == winnerValue){
                        System.out.println("Игрок Выиграл ");
                        player.showHand();

                    }

                }

            }

        }


    }

    @Override
    public int countPlayersInGame() {
        int summe = 0;
        for (IPlayer player : players) {
            if (player != null) {
                if (player.isInGame()) {
                    summe++;

                }

            }

        }
        return summe;
    }
}
