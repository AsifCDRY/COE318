package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {

    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("House holds: " + this.game.getHouseCards().toString());
        System.out.println("You hold: " + this.game.getYourCards().toString());       
    }

    @Override
    public boolean hitMe() {
        System.out.println("Another card? ('y' or 'n')");
        String userRes = user.nextLine();
        if(userRes.equals("y"))
            return true;
        else if(!userRes.equals("y") && !userRes.equals("n")){
            System.out.println("Please choose either 'y' or 'n'");
            hitMe();
        }
        return false;
    }

    @Override
    public void gameOver() {
        display();
        System.out.println("Your score: " + game.score(game.getYourCards()));
        System.out.println("House score: " + game.score(game.getHouseCards()));
        if(game.score(game.getYourCards()) > 21)
            System.out.println("The House wins");
        else if(game.score(game.getHouseCards()) > 21)
             System.out.println("You win");   
        else if(game.score(game.getHouseCards()) < game.score(game.getYourCards()))
            System.out.println("You win");
        else
            System.out.println("The House wins");
    }

}
