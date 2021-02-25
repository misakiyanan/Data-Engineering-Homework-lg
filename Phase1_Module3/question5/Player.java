package question5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class Player {
    private String name;
    private HashMap<Integer, String> myCards = new HashMap<>();

    // constructors:
    public Player() { }
    public Player(String name) {
        setName(name);
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    // get card
    public void getCard(Integer k, String v) {
        myCards.put(k, v);
    }

    // display all cards
    public void displayCards() {
        ArrayList<Integer> keys = new ArrayList<>(myCards.keySet());
        Collections.sort(keys);
        for (Integer key: keys) {
            System.out.println(myCards.get(key));
        }
    }


}
