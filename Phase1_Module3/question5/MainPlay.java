package question5;
/*
* 5. 编程题
使用集合实现斗地主游戏的部分功能，要求如下：
 （1）首先准备 54 张扑克牌并打乱顺序。
 （2）由三个玩家交替摸牌，每人 17 张扑克牌，最后三张留作底牌。
 （3）查看三个玩家手中的扑克牌和底牌。
 （4）其中玩家手中的扑克牌需要按照大小顺序打印，规则如下：

  手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class MainPlay {
    public static void main(String[] args) {
        Cards cards = new Cards();
        HashMap<Integer, String> totalCards = cards.initCards();
        Random rand = new Random();

        // init players
        Player player1 = new Player ("1号玩家");
        Player player2 = new Player ("2号玩家");
        Player player3 = new Player ("3号玩家");
        Player[] players = {player1, player2, player3};

        // assign cards to all players
        System.out.println(">>> 玩家开始交替摸牌");
        while (totalCards.size() > 3) {
            for (Player player: players) {
                int key;
                while(true) {
                    key = rand.nextInt(54)+1;
                    if (totalCards.containsKey(key)) {
                        // check if card with this key is already assigned
                        break;
                    }
                }

                String value = totalCards.get(key);
                player.getCard(key, value);
                System.out.println(player.getName() + "抓牌:" + value);
                totalCards.remove(key);
            }
        }


        // display cards of each player
        System.out.println();
        System.out.println(">>> 查看玩家手中的扑克牌");
        for (Player player: players) {
            System.out.println(player.getName() + "当前手中的扑克牌有：");
            player.displayCards();
            System.out.println();
        }


        // display remaining cards
        System.out.println();
        System.out.println(">>> 查看剩余的三张底牌");
        ArrayList<Integer> keys = new ArrayList<>(totalCards.keySet());
        Collections.sort(keys);
        for (Integer key: keys) {
            System.out.println(totalCards.get(key));
        }

    }
}
