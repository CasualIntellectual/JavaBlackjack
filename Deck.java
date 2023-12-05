import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Arrays;


public class Deck {
    
    private int num;
    private String saved;
    private ArrayList<String> deckContents = new ArrayList<String>();
    private ArrayList<String> suits = new ArrayList<String>();
    
    public void createDeck(){
        suits.add("♣");
        suits.add("♢");
        suits.add("♡");
        suits.add("♠");
        deckContents.clear();
        for (int k = 0; k < 8; k++){
            for (int i = 0; i < 4; i++){
                deckContents.add(suits.get(i) + "2");
                deckContents.add(suits.get(i) + "3");
                deckContents.add(suits.get(i) + "4");
                deckContents.add(suits.get(i) + "5");
                deckContents.add(suits.get(i) + "6");
                deckContents.add(suits.get(i) + "7");
                deckContents.add(suits.get(i) + "8");
                deckContents.add(suits.get(i) + "9");
                deckContents.add(suits.get(i) + "10");
                deckContents.add(suits.get(i) + "J");
                deckContents.add(suits.get(i) + "K");
                deckContents.add(suits.get(i) + "Q");
                deckContents.add(suits.get(i) + "A");
                }
        }
    }
    public void printDeck(){
        System.out.println(deckContents.get(0));
    }
    public String draw(){
        
        num = (int)(Math.random()*deckContents.size());
        saved = deckContents.get(num);
        deckContents.remove(deckContents.get(num));
        return saved;
    }

}
