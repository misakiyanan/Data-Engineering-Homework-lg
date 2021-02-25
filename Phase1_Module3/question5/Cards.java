package question5;

import java.util.HashMap;

public class Cards{

    private static final String[] SUITS =
            {" 黑桃♠ ", " 红心♥", " 梅花♣", " 方块♦"};
    private static final String[] NUMBERS =
            {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
    private static final String[] GHOSTS = {"大王", "小王"};

    public HashMap<Integer, String> initCards(){
        HashMap<Integer, String> cards = new HashMap<>();
        // key is rank(1-54), value is card display (suit + number)

        // insert all cards
        cards.put(1, GHOSTS[0]);
        cards.put(2, GHOSTS[1]);
        int key = 3;
        for (int i=0; i<NUMBERS.length; i++) {
            for (int j=0; j<SUITS.length; j++) {
                cards.put(key, ""+NUMBERS[i]+SUITS[j]);
                key++;
            }
        }
        return cards;
    }
}
