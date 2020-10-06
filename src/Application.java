/**
 * Class with main method
 *
 * @author (André Queiroz)
 * @version (02/10/2020)
 */

public class Application {

    public static void main(String args[]){

        Controller control = new Controller();

        System.out.println("\n--------------- THE HANGMAN GAME ---------------");
        control.startGame();

    }
}