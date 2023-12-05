import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class MyProgram
{
    
    public static void main(String[] args)
    {

        
        ArrayList<Hand> collectedHands = new ArrayList<Hand>();
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int count = 1;
        boolean surrender = false;
        boolean achieved_one = false;
        boolean achieved_two = false;
        boolean achieved_three = false;
        boolean achieved_four = false;
        Scanner scanner = new Scanner(System.in);
        int money = 100;
        boolean done = false;
        System.out.println("");
        System.out.println("                    _____");
        System.out.println("                   |/////| _____");
        System.out.println("                   |/////||/////| _____");
        System.out.println("                   |/////||/////||/////| _____");
        System.out.println("                   |/////||/////||/////||/////|");
        System.out.println("                   |/////||/////||/////||/////|");
        System.out.println("                          |/////||/////||/////|");
        System.out.println("                                 |/////||/////|");
        System.out.println("                                        |/////|");
        
        try {
          Thread.sleep(750);
        }
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("                    _____");
        System.out.println("                   |A .  | _____");
        System.out.println("                   | /.\\ ||/////| _____");
        System.out.println("                   |(_._)||/////||/////| _____");
        System.out.println("                   |  |  ||/////||/////||/////|");
        System.out.println("                   |____V||/////||/////||/////|");
        System.out.println("                          |/////||/////||/////|");
        System.out.println("                                 |/////||/////|");
        System.out.println("                                        |/////|");
        System.out.println("");
        try {
          Thread.sleep(750);
        }
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("                    _____");
        System.out.println("                   |A .  | _____");
        System.out.println("                   | /.\\ ||A ^  | _____");
        System.out.println("                   |(_._)|| / \\ ||/////| _____");
        System.out.println("                   |  |  || \\ / ||/////||/////|");
        System.out.println("                   |____V||  .  ||/////||/////|");
        System.out.println("                          |____V||/////||/////|");
        System.out.println("                                 |/////||/////|");
        System.out.println("                                        |/////|");
        System.out.println("");
   
        try {
          Thread.sleep(750);
        }
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("                    _____");
        System.out.println("                   |A .  | _____");
        System.out.println("                   | /.\\ ||A ^  | _____");
        System.out.println("                   |(_._)|| / \\ ||A _  | _____");
        System.out.println("                   |  |  || \\ / || ( ) ||/////|");
        System.out.println("                   |____V||  .  ||(_'_)||/////|");
        System.out.println("                          |____V||  |  ||/////|");
        System.out.println("                                 |____V||/////|");
        System.out.println("                                        |/////|");
        System.out.println("");
        try {
          Thread.sleep(750);
        }
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("                    _____");
        System.out.println("                   |A .  | _____");
        System.out.println("                   | /.\\ ||A ^  | _____");
        System.out.println("                   |(_._)|| / \\ ||A _  | _____");
        System.out.println("                   |  |  || \\ / || ( ) ||A_ _ |");
        System.out.println("                   |____V||  .  ||(_'_)||( v )|");
        System.out.println("                          |____V||  |  || \\ / |");
        System.out.println("                                 |____V||  .  |");
        System.out.println("                                        |____V|");
        try {
          Thread.sleep(750);
        }
        catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("                    _____");
        System.out.println("                   |A .  | _____");
        System.out.println("                   | /.\\ ||A ^  | _____");
        System.out.println("                   |(_._)|| / \\ ||A _  | _____");
        System.out.println("                   |  |  || \\ / || ( ) ||A_ _ |");
        System.out.println("                   |____V||  .  ||(_'_)||( v )|");
        System.out.println("                          |____V||  |  || \\ / |");
        System.out.println("                                 |____V||  .  |");
        System.out.println("                                        |____V|");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("__________.__                 __        ____.              __     ____   ____________");  
        System.out.println("\\______   \\  | _____    ____ |  | __   |    |____    ____ |  | __ \\   \\ /   /\\_____  \\ "); 
        System.out.println(" |    |  _/  | \\__  \\ _/ ___\\|  |/ /   |    \\__  \\ _/ ___\\|  |/ /  \\   Y   /  /  ____/");  
        System.out.println(" |    |   \\  |__/ __ \\  \\___|     < /\\__|    |/ __ \\  \\___|    <    \\     /  /       \\ "); 
        System.out.println(" |______  /____(____  /\\___  >__|_ \\________(____  /\\___  >__|_ \\    \\___/   \\_______ \\"); 
        System.out.println("        \\/          \\/     \\/     \\/             \\/     \\/     \\/                    \\/"); 
        System.out.println("By Kai Huang");
        System.out.println("");
        System.out.println("Enter anything to start: ");
        Deck deck = new Deck();
        deck.createDeck();
        while(true){
            String input;
            input = scanner.nextLine();
            if (input.equals("Y")){
                break;
                }
            
            else{
                break;
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.println("Welcome to BlackJack V2!");
        System.out.println("Unicode Sytem\u00A9");
        System.out.println("");
        System.out.println("The objective is to score higher than the dealer without exceeding 21.\n The player and the dealer are both dealt two cards, valued \n between 1 and 11. The dealer's first card is hidden while the player \n takes their actions.\nThe player can then choose to stay, keeping their current total,\n or hit, drawing a new card valued between 1 and 11.\n This is repeated until the player exceeds 21, a bust, for an immediate\n loss; makes a total of exactly 21, a BlackJack, for an immediate win;\n or chooses to stay. \n If the player has a good hand, they may also choose to double down, \n doubling their bet and drawing one card. \n Otherwise, they may surrender, immediately forfeiting but only losing \n half their bet. \n Good luck, and get the highest winnings you can!");
        System.out.println("");
        while(true){
            Hand hand = new Hand();
            collectedHands.add(hand);
            Hand enemyhand = new Hand();
            Hand displayHand = new Hand();
            for(int i = 0; i < 2; i++){
                hand.putInHand(deck);
                enemyhand.putInHand(deck);
            }
            int bet = 0;
            boolean cont = false;
            int total = 0;
            int enemytotal = 0;
            System.out.println("You currently have: $" + money);
            System.out.println("------------------------------------------------");
            if (money == 0){
                System.out.println("You don't have any money to bet with!");
                break;
            }
            while (bet == 0){
                String Newbet;
                System.out.println("How much money would you like to wager?: ");
                try{
                    Newbet = scanner.nextLine();
                    if(Integer.parseInt(Newbet) > money){
                        System.out.println("You don't have enough money!");
                        bet = 0;
                        continue;
                    }
                    if (Integer.parseInt(Newbet) <= money){
                        bet = Integer.parseInt(Newbet);
                        break;
                    }
                }
                catch(Exception e){
                    System.out.println("That was not a valid integer amount.");
                    continue;
                }
               
              

            }
            System.out.print("\033[H\033[2J");
            System.out.println("===================ROUND=============START=====================");
            displayHand.makeHidden();
            displayHand.conceal(enemyhand.getCard(0));
            for(int i = 0; i < collectedHands.size(); i++){
                System.out.println("HAND" + (i+1));
                (collectedHands.get(i)).calculateTotal();
                enemyhand.calculateTotal();
                System.out.println("Your total is: " + (collectedHands.get(i)).getTotal());
                
                System.out.println("Your hand is: " );
                (collectedHands.get(i)).displayCard();
                
                System.out.println("Your opponent's hand is: ");
    
                System.out.println("-----------------------------------------------------------");
                while ((collectedHands.get(i)).getTotal() < 21){
                    String input;
                    System.out.println("Hit(H), Stay(S), Surrender(X), Split(SP), or Double(D)");
                    input = scanner.nextLine();
                    if (input.equals("H")){
                        System.out.print("\033[H\033[2J");
        
                        (collectedHands.get(i)).putInHand(deck);
                        (collectedHands.get(i)).calculateTotal();
                        System.out.println("HAND" + (i+1));
                        System.out.println("Your hand is: ");
                        (collectedHands.get(i)).displayCard();
                        System.out.println("Current total : " + (collectedHands.get(i)).getTotal());
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Your opponent's hand is: ");
                        displayHand.displayCard();
                    }
                    else if (input.equals("S")){
                        System.out.print("\033[H\033[2J");
                        (collectedHands.get(i)).calculateTotal();
                        System.out.println("HAND" + (i+1));
                        System.out.println("Your hand is:");
                        (collectedHands.get(i)).displayCard();
                        System.out.println("Current total : " +(collectedHands.get(i)).getTotal());
                        System.out.print("\033[H\033[2J");
                        break;
                    }
                    else if (input.equals("X")){
                        surrender = true;
                        System.out.print("\033[H\033[2J");
                        (collectedHands.get(i)).calculateTotal();
                        System.out.println("HAND" + (i+1));
                        System.out.println("Your hand is: ");
                        (collectedHands.get(i)).displayCard();
                        System.out.println("Current total : " + (collectedHands.get(i)).getTotal());
                        bet /= 2;
                         System.out.print("\033[H\033[2J");
                        break;
                    }
                    else if (input.equals("D")){
                        System.out.print("\033[H\033[2J");
                        
                        bet *= 2;
                        (collectedHands.get(i)).putInHand(deck);
                        (collectedHands.get(i)).calculateTotal();
                        System.out.println("HAND" + (i+1));
                        System.out.println("Your hand is: " );
                        (collectedHands.get(i)).displayCard();
                        System.out.println("Current total : " +(collectedHands.get(i)).getTotal());
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Your opponent's hand is: ");
                        displayHand.displayCard();
                    }
                    else if (input.equals("SP") && ((collectedHands.get(i)).getCard(0) == (collectedHands.get(i)).getCard(1)) && (collectedHands.size() < 3)){
                        collectedHands.add(new Hand());
                        
                        (collectedHands.get(count)).add((collectedHands.get(count-1)).getCard(0));
                        (collectedHands.get(count)).putInHand(deck);
                        (collectedHands.get(count-1)).takeOut();
                        (collectedHands.get(count-1)).putInHand(deck);
                        System.out.println("NEW HAND CREATED: " + (collectedHands.size()));
                        count += 1;
                        (collectedHands.get(count-1)).displayCard();
                        
                        
                    }
                }
            }
                
            for(int j = 0; j < collectedHands.size(); j++){    
                System.out.println("HAND" + (j+1));
                if ((collectedHands.get(j)).getTotal() > 21){
                    System.out.println("Bust!");
                    money -= bet;
                    losses += 1;
                }
                else if ((collectedHands.get(j)).getTotal() == 21){
                    System.out.println("Blackjack!");
                    money += bet;
                    wins += 1;
                }
                while ((enemyhand.getTotal() < 17) && ((collectedHands.get(j)).getTotal() < 22)){
                    enemyhand.putInHand(deck);
                    enemyhand.calculateTotal();
                    }
            
                if (surrender == true){
                    System.out.println("Surrender!");
                    money -= bet;
                    losses += 1;
                }
                else if ((collectedHands.get(j)).getTotal() > enemyhand.getTotal() && (collectedHands.get(j)).getTotal() <= 21){
                    System.out.println("You win!");
                    money += bet;
                    wins += 1;
                }
                else if (enemyhand.getTotal() == 21 && (collectedHands.get(j)).getTotal() <21){
                    System.out.println("The dealer got a Blackjack! You lose!");
                    money -= bet;
                    losses += 1;
                }
                else if (enemyhand.getTotal() > 21 && (collectedHands.get(j)).getTotal() < 21){
                    System.out.println("The dealer busted! You win!");
                    money += bet;
                    wins += 1;
                    
                }
                else if ((collectedHands.get(j)).getTotal() < enemyhand.getTotal() && enemyhand.getTotal() < 21){
                    System.out.println("You lose!");
                    money -= bet;
                    losses += 1;
                }
                else if ((collectedHands.get(j)).getTotal() == enemyhand.getTotal() && (collectedHands.get(j)).getTotal() < 21){
                    System.out.println("Both hands are equal. Push.");
                    ties += 1;
                }
                
                
                if (hand.getTotal() == enemyhand.getTotal()){
                    System.out.println("-----------------------------------------------------------");
                    continue;
                }
            }
            System.out.println("Your opponent's hand had a total of " + enemyhand.getTotal() + " and a hand of: ");
            enemyhand.displayCard();
                
            System.out.println("You now have $" + money);
            collectedHands.clear();
            count = 1;
            while(true){
                String input;
                System.out.println("Would you like to see your Statistics? (Y or N)");
                input = scanner.nextLine();
                if (input.equals("Y")){
                    System.out.print("\033[H\033[2J");
                    System.out.println("========STATISTICS========");
                    System.out.println("Wins: " + wins);
                    System.out.println("Losses: " + losses);
                    System.out.println("Ties: " + ties);
                    System.out.println("Percentage victories: " + ((wins+0.5*ties)/(wins+losses+ties)*100) + "%");
                    System.out.println("Average earnings per game: $" + ((money-100)/(wins + losses + ties)));
                    System.out.println("Overall money made: $" + (money-100));
                    System.out.println("");
                    System.out.println("");
                    System.out.println("========ACHIEVEMENTS========");
                    System.out.println("");
                    if (money >= 200 || achieved_one == true){
                        System.out.println("Achievement: Money Doubler (Reach $ 200)");
                        achieved_one = true;
                    }
                    if (money >= 1000 || achieved_two == true){
                        System.out.println("Achievement: Triple Digit (Reach $ 1000)");
                        achieved_two = true;
                    }
                    if (money >= 1000000 || achieved_three == true){
                        System.out.println("Achievement: New Car (Reach $ 10000)");
                        achieved_three = true;
                    }
                    if (money <= 0 || achieved_four == true){
                        System.out.println("Achievement: Bankrupt (Go broke for the first time)");
                        achieved_four = true;
                    }
                    if ((wins+losses+ties) > 10){
                        System.out.println("Achievement: Gambling addict (Play the game ten times)");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                    }
                    System.out.println("Enter anything to exit: ");
                    input = scanner.nextLine();
                    if (input.equals("")){
                        System.out.print("\033[H\033[2J"); 
                        break;
                    }
                    else{
                        System.out.print("\033[H\033[2J"); 
                        break;
                    }
                    
                }
                else if (input.equals("N")){
                    break;
                }
            }

            String input;
            System.out.println("Would like to play again? (Y or N)");
            input = scanner.nextLine();
            while(true){
                if (input.equals("Y")){
                    System.out.print("\033[H\033[2J");
                    break;
                    }
                
                else if (input.equals("N")){
                    done = true;
                    System.out.print("\033[H\033[2J"); 
                    break;
                }
            }
            if (done == true){
                
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |A .  | _____");
                System.out.println("                   | /.\\ ||A ^  | _____");
                System.out.println("                   |(_._)|| / \\ ||A _  | _____");
                System.out.println("                   |  |  || \\ / || ( ) ||A_ _ |");
                System.out.println("                   |____V||  .  ||(_'_)||( v )|");
                System.out.println("                          |____V||  |  || \\ / |");
                System.out.println("                                 |____V||  .  |");
                System.out.println("                                        |____V|");
                try {
                  Thread.sleep(750);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |/////| _____");
                System.out.println("                   |/////||A ^  | _____");
                System.out.println("                   |/////|| / \\ ||A _  | _____");
                System.out.println("                   |/////|| \\ / || ( ) ||A_ _ |");
                System.out.println("                   |/////||  .  ||(_'_)||( v )|");
                System.out.println("                          |____V||  |  || \\ / |");
                System.out.println("                                 |____V||  .  |");
                System.out.println("                                        |____V|");
                System.out.println("");
           
                try {
                  Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |/////| _____");
                System.out.println("                   |/////||/////| _____");
                System.out.println("                   |/////||/////||A _  | _____");
                System.out.println("                   |/////||/////|| ( ) ||A_ _ |");
                System.out.println("                   |/////||/////||(_'_)||( v )|");
                System.out.println("                          |/////||  |  || \\ / |");
                System.out.println("                                 |____V||  .  |");
                System.out.println("                                        |____V|");
          
                try {
                  Thread.sleep(750);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |/////| _____");
                System.out.println("                   |/////||/////| _____");
                System.out.println("                   |/////||/////||/////| _____");
                System.out.println("                   |/////||/////||/////||A_ _ |");
                System.out.println("                   |/////||/////||/////||( v )|");
                System.out.println("                          |/////||/////|| \\ / |");
                System.out.println("                                 |/////||  .  |");
                System.out.println("                                        |____V|");
                System.out.println("");
           
                try {
                  Thread.sleep(750);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |/////| _____");
                System.out.println("                   |/////||/////| _____");
                System.out.println("                   |/////||/////||/////| _____");
                System.out.println("                   |/////||/////||/////||/////|");
                System.out.println("                   |/////||/////||/////||/////|");
                System.out.println("                          |/////||/////||/////|");
                System.out.println("                                 |/////||/////|");
                System.out.println("                                        |/////|");
                System.out.println("");
                try {
                  Thread.sleep(750);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                System.out.println("\033[H\033[2J");
                System.out.println("                    _____");
                System.out.println("                   |/////| _____");
                System.out.println("                   |/////||/////| _____");
                System.out.println("                   |/////||/////||/////| _____");
                System.out.println("                   |/////||/////||/////||/////|");
                System.out.println("                   |/////||/////||/////||/////|");
                System.out.println("                          |/////||/////||/////|");
                System.out.println("                                 |/////||/////|");
                System.out.println("                                        |/////|");
                System.out.println("");
                System.out.println("  ________                  .___   ________                     ._.");
                System.out.println(" /  _____/  ____   ____   __| _/  /  _____/_____    _____   ____| |");
                System.out.println("/   \\  ___ /  _ \\ /  _ \\ / __ |  /   \\  ___\\__  \\  /     \\_/ __ \\ |");
                System.out.println("\\    \\_\\  (  <_> |  <_> ) /_/ |  \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/\\|");
                System.out.println(" \\______  /\\____/ \\____/\\____ |   \\______  (____  /__|_|  /\\___  >_");
                System.out.println("        \\/                   \\/          \\/     \\/      \\/     \\/\\/");    
                System.out.println("Thanks for playing!");
                try {
                  Thread.sleep(750);
                }
                catch (InterruptedException e) {
                  Thread.currentThread().interrupt();
                }
                for (int i = 5; i > 0; i--){
                    System.out.println("\033[H\033[2J");
                    System.out.println("Starting again in: " + i);
                    try {
                         Thread.sleep(1000);
                        }
                    catch (InterruptedException e) {
                         Thread.currentThread().interrupt();
                        }
                
                }
                System.out.println("\033[H\033[2J");
                
            }
        }
            
    }
    
}

