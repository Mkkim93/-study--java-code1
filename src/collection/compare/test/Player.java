package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getRank();

        }
        return value;
    }

    public void showHand() {
        hand.sort(null); // 플레이어 카드를 보여줄때 정렬
        System.out.println(name + "의 카드 : " + hand + ", 합계 : " + rankSum());
    }

}
