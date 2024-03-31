package PokerSystem;

import java.util.ArrayList;
import java.util.Collections;

public class PokerTest {
    public static void main(String[] args) {
        ArrayList<Poker> list = generateCode();

        ArrayList<Poker> player01 = new ArrayList<>();
        ArrayList<Poker> player02 = new ArrayList<>();
        ArrayList<Poker> player03 = new ArrayList<>();

        deal(list,player01,player02,player03);
        System.out.println(list);
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);

    }   // Method main end.

    public static ArrayList<Poker> generateCode() {
        ArrayList<Poker> list = new ArrayList<>();
        list.add(new Poker("", "大王", 0));
        list.add(new Poker("", "小王", 1));
        String [] color = {"♥", "♠", "♣", "♦"};
        String [] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int order = 2;
        for (String j : color){
            for (String i : numbers) {
                list.add(new Poker(j, i, order));
                order++;
            }
        }
        Collections.shuffle(list);
        return list;
    }   // Method end.

    public static void deal(ArrayList<Poker> list,ArrayList<Poker> ... l) {
        int index = 0;
        int number = list.size() / l.length -1;

        for (ArrayList<Poker> player : l) {
            for (int i = 0; i < number; i++) {
                player.add(list.remove(0));
            }
        }

    }   // Method end.

}