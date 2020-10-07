/**
 * Class with the functions
 * related to the words
 *
 * @author (André Queiroz)
 * @version (02/10/2020)
 */

public class Model {

    View output = new View();
    int line; // Stores the selected line
    int column; // Stores the selected column
    char rightChoice[];
    char wrongLetters[] = new char[6];

    /**
     *  String array bi-dimensional (5 lines and 8 columns).
     *  It's a constant array.
     *  The first column contains the hints.
     */
    String data[][] = {
            {"country", "brazil", "germany", "unitedstates", "italy", "russia", "switzerland", "australia"},
            {"food", "chicken", "lasagna", "croissant", "hamburger", "barbecue", "pizza", "pasta"},
            {"car", "bmw", "ferrari", "mercedes", "audi", "dodge", "jaguar", "mustang"},
            {"name", "emma", "joey", "john", "isabella", "mark", "rachel", "benjamin "},
            {"programming language", "java", "c#", "python", "php", "javascript", "ruby", "assembly"}
    };


    /**
     *     Stores the array's line and returns the hint.
     *
     *     Math.random() generate double values between 0 to 1.0
     *     Int casting, set the value's range
     *     that will be randomized (array length).
     *
     */
    public void generateHint(){
        // randomly generate the array's line
        line = (int) (Math.random() * data.length);
    }


    /**
     *  return hint.
     */
    public String returnHint(){
        return (data[line][0]);
    }


    /**
     *  generate word.
     */
    public void generateWord(){
        // Randomly generate array's word (from the first column)
        column = (int)(Math.random() * (data[line].length - 1)) + 1;
        rightChoice = new char[data[line][column].length()];
    }


    /**
     *  return word's selected line, starting in
     *  the second column.
     */
    public String returnVisibleWord(){
        return (data[line][column]);
    }


    /**
     *   Return hidden word (with -----).
     */
    public String returnHiddenWord(){

        String word = data[line][column];
        int wordSize = word.length();

        // Build String with - according to the size
        String s = "";
        for (int i = 0; i < wordSize; i++){
            s = s + " - ";
        }
        return s;
    }


    /**
     *   Letter to be checked (if it exists in the word)
     *   Returns incomplete word
     */
    public String returnIncompleteWord(){
        // Build String with - according to the size
        String incompleteWord = "";

        for (int i = 0; i < rightChoice.length; i++){
            if (rightChoice[i] != 0) {
                incompleteWord += rightChoice[i];
            } else {
                incompleteWord += " - ";
            }
        }
        return incompleteWord;
    }


    /**
     *   Checks the letter in the string
     *
     *   Return boolean (true if there is a letter in the string, false if it doesn't exist)
     */
    public boolean checkLetter(char letter){
        String word = data[line][column];
        int wordSize = word.length();
        int letterExists = 0;
        boolean bool = false;

        // Sweeps string char by char
        for (int i = 0; i < wordSize; i++){
            if (word.charAt(i) == letter) { // if it exists
                bool = true;
                rightChoice[i] = letter;
                letterExists++;
            }
        }
        return bool;
    }


    public String getWord(){
        return data[line][column];
    }


    public String getProvidedWord(){
        String word = "";
        for (int i = 0; i < rightChoice.length; i++) {
            if (rightChoice[i] != 0) {
                word += rightChoice[i];
            }
        }
        return word;
    }


    public void guessWord(){
        System.out.println("Take your guess: ");
        String guess = output.getString();

        if (guess.equals(returnVisibleWord())) {
            output.showWon();
        } else {
            output.showLost();
        }
    }


    boolean checkWord(String word, String providedWord){
        boolean bool = false;
        if (word.equals(providedWord)){
            bool = true;
            output.showWon();
        }
        return bool;
    }

    /**
     *  Stores incorrect user's input into wrongLetters[] array
     */
    public void storeWrongLetters(char letter , int count){
        wrongLetters[count] = letter;
        System.out.print("Wrong letters: ");
        for (int i = 0; i < (count + 1); i++) {
            System.out.print(wrongLetters[i] + " ");
        }
    }

    /**
     *  Checks if the incorrect letter has already been entered
     */
    public boolean checkWrongLettersAlreadyTyped(char letter){
        boolean ret = false;
        for (int i = 0; i < wrongLetters.length; i++){
            if (wrongLetters[i] == letter){
                ret = true;
            }
        }
        return ret;
    }


    /**
     *  Returns all words in the array
     */
    public String returnWords(){
        int xLines = data.length;
        int xColumns = data[0].length;
        String s = "";

        for (int line = 0; line < xLines; line++){
            for(int column = 0; column < xColumns; column++){
                s = s + data[line][column];
            }
            s = s + "\n";
        }
        return s;
    }

}
