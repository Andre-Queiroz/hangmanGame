import java.util.Scanner;

/**
 * Class for user interaction
 *
 * @author (André Queiroz)
 * @version (02/10/2020)
 */

public class View {

    Scanner input = new Scanner(System.in);

    /**
     *  show hint.
     */
    public void showHint(String hint){
        System.out.println("HINT: " + hint);
    }


    /**
     *  show word.
     */
    public void showWord(String word){
        System.out.println("WORD: " + word);
    }


    /**
     * Keep printing it into the do-while controller loop
     */
    public void showStartMessages(){
        System.out.println("(To try to guess the whole word, press 0)");
        System.out.println("Enter the letter: ");
    }


    /**
     *  input a char.
     */
    public char getChar(){
        char letter = input.next().toLowerCase().charAt(0);
        return letter;
    }


    /**
     *  input a String
     */
    public String getString(){
        String str = input.next().toLowerCase();
        return str;
    }


    /**
     *  Print the message if user's input belong to the word
     */
    public void showLetterExists(){
        System.out.println("\n\n\n-------------------------");
        System.out.println("Letter exists in the word");
        System.out.println("-------------------------");
    }


    /**
     *  Print the message if user's input doesn't belong to the word
     */
    public void showLetterDoesntExists(){
        System.out.println("\n\n\n---------------------------------");
        System.out.println("Letter doesn't exists in the word");
        System.out.println("---------------------------------");
    }

    public void showWrongLettersAlreadyTyped(){
        System.out.println("\n\n\n----------------------------------");
        System.out.println("This letter has already been typed");
        System.out.println("----------------------------------");
    }

    public void showFirstError(){
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    public void showSecondError(){
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |           |   ");
        System.out.println("   |           |   ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    public void showThirdError(){
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |          /|   ");
        System.out.println("   |           |   ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    public void showFourthError(){
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |          /|\\ ");
        System.out.println("   |           |   ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    public void showFifthError(){
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |          /|\\ ");
        System.out.println("   |           |   ");
        System.out.println("   |          /    ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    public void showSixthError(){
        showLost();
        System.out.println("   ____________    ");
        System.out.println("   |           |   ");
        System.out.println("   |           0   ");
        System.out.println("   |          /|\\ ");
        System.out.println("   |           |   ");
        System.out.println("   |          / \\ ");
        System.out.println("   |               ");
        System.out.println("   |               ");
        System.out.println(" __|__             ");
    }

    /**
     *  Label for the victory
     */
    public void showWon(){
        System.out.println("=========================");
        System.out.println("         YOU WON!        ");
        System.out.println("=========================");
    }


    /**
     *  Label for the defeating
     */
    public void showLost(){
        System.out.println("=========================");
        System.out.println("         YOU LOST!       ");
        System.out.println("=========================");
    }

}
