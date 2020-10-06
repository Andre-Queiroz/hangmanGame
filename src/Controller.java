/**
 * Class to control interaction
 * between model and view
 *
 * @author (André Queiroz)
 * @version (02/10/2020)
 */

public class Controller {

    Model game = new Model();
    View output = new View();
    char letter;


    public void startGame() {

        game.generateHint();
        game.generateWord();
        output.showHint(game.returnHint());
        output.showWord(game.returnHiddenWord());

        int count = 0;

        do {

            output.showStartMessages();
            letter = output.getChar();

            if (letter == '0') {
                game.guessWord();
                System.out.println("The word was: " + game.returnVisibleWord());
                break;
            }

            if (game.checkLetter(letter)) {
                output.showLetterExists();
            } else {
                output.showLetterDoesntExists();
                game.storeWrongLetters(letter, count);
                count = count + 1;
                System.out.println();

                if (count == 1) {
                    output.showFirstError();
                }
                if (count == 2) {
                    output.showSecondError();
                }
                if (count == 3) {
                    output.showThirdError();
                }
                if (count == 4) {
                    output.showFourthError();
                }
                if (count == 5) {
                    output.showFifthError();
                }
                if (count == 6) {
                    output.showSixthError();
                    System.out.println("The word was: " + game.returnVisibleWord());
                    break;
                }
            }
            output.showWord(game.returnIncompleteWord());

        } while (count != 6 && !game.checkWord(game.getWord(), game.getProvidedWord()));
    }
}