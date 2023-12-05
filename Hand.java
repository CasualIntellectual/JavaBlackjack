
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Arrays;

public class Hand {
    private int total = 0;
    private ArrayList<String> handContents = new ArrayList<String>();
    private boolean isDisplay;
    public String getCard(int index){
        return handContents.get(index);
    }
    public void putInHand(Deck deck){
        handContents.add(deck.draw());

    }
    public void takeOut(){
        handContents.remove(handContents.get(0));
    }
    public void add(String card){
        handContents.add(card);
    }
    public void conceal(String addition){
        handContents.add(addition);
    }
    public void displayCard(){
        for (int i = 0; i < handContents.size(); i++){
            System.out.print(" _____ ");
        }
        if (isDisplay){
            System.out.print(" _____ ");
        }
        System.out.println("");
        for (int i = 0; i < handContents.size(); i++){
            if (((handContents.get(i)).substring(1)).equals("10") || ((handContents.get(i)).substring(1)).equals("11")  || ((handContents.get(i)).substring(1)).equals("12")){
                System.out.print("|   " + (handContents.get(i)).substring(1) +"|");
            }
            else{
                System.out.print("|    " + (handContents.get(i)).substring(1) +"|");
            }
            
        }
        if (isDisplay){
            System.out.print("|/////|");
        }
        System.out.println("");
        
        for (int i = 0; i < handContents.size(); i++){
            System.out.print("|     |");
        }
        if (isDisplay){
            System.out.print("|/////|");
        }
        System.out.println("");
        for (int i = 0; i < handContents.size() -1; i++){
            if (!isDisplay){
                System.out.print("|  " + (handContents.get(i)).substring(0, 1) + "  |");
            }
            else{
                System.out.println("|  " + (handContents.get(i)).substring(0, 1) + "  |");
            }
        }
        
        
        if (!isDisplay){
        System.out.println("|  " + (handContents.get(handContents.size()-1)).substring(0, 1)+ "  |");
        }
        else{
            System.out.print("|  " + (handContents.get(handContents.size()-1)).substring(0, 1)+ "  |");
            System.out.println("|/////|");
        }
        
        
        
        for (int i = 0; i < handContents.size(); i++){
            System.out.print("|     |");
        }
        if (isDisplay){
            System.out.print("|/////|");
        }
        System.out.println("");
        for (int i = 0; i < handContents.size(); i++){
            if (((handContents.get(i)).substring(1)).equals("10") || ((handContents.get(i)).substring(1)).equals("11")  || ((handContents.get(i)).substring(1)).equals("12")){
                System.out.print("|" + (handContents.get(i)).substring(1) + "___|");
            }
            else{
                System.out.print("|" + (handContents.get(i)).substring(1) + "____|");
            }
        }
        if (isDisplay){
            System.out.print("|/////|");
        }
        System.out.println("");
    }
    public void calculateTotal(){
        total = 0;
        for (int k = 0; k < handContents.size(); k++){
            if (((handContents.get(k)).substring(1)).equals("Q") || ((handContents.get(k)).substring(1)).equals("K") || ((handContents.get(k)).substring(1)).equals("J")) {
                total += 10;
            }
            else if (!((handContents.get(k)).substring(1)).equals("A")){
                total += Integer.parseInt(((handContents.get(k)).substring(1)));
            }
        }
        for (int j = 0; j < handContents.size(); j++){
            if (((handContents.get(j)).substring(1)).equals("A")){
                if (total + 11 > 21){
                    total += 1;
                }
                else{
                    total += 11;
                }
            }
        }
    }
    public int getTotal(){
        return total;
    }
    public void makeHidden(){
        isDisplay = true;
    }
    
    
}
