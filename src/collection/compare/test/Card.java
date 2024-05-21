package collection.compare.test;

public class Card implements Comparable<Card>{

    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank != o.rank) {
            return Integer.compare(this.rank, o.rank); // 입력된 rank 와 기존에 있던 rank 크기를 비교
        } else {
         return this.suit.compareTo(o.suit);
        }
    }

    @Override
    public String toString() {
        return rank + " (" + suit.getIcon() + ")";
    }
}
