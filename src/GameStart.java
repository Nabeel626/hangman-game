import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameStart {

    private int lives = 8;
    private boolean guessCorrect = false;
    private boolean start = true;
    public String chosenMode = "";
    private final ArrayList<String> storeLetter = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void play(String chosen) {
        chosenMode = chosen;
        WordGenerator wordGenerator = new WordGenerator();

        if(chosenMode == "easy") {
            wordGenerator.getDifficultyInput(chosenMode);
        } else if (chosenMode == "medium") {
            wordGenerator.getDifficultyInput(chosenMode);
        } else {
            wordGenerator.getDifficultyInput(chosenMode);
        }

        wordGenerator.generateWord();

        while (start) {
            if (lives == 0 || lives < 0) {
                System.out.println();
                System.out.println("YOU HAVE RUN OUT OF LIVES :( ");
                start = false;
                TryAgainMenu tryAgainMenu = new TryAgainMenu();
                tryAgainMenu.tryAgain();
            }

            if(WordGenerator.completedWord(wordGenerator.showWord)){
                guessCorrect = true;
                System.out.println("CONGRATULATIONS YOU GUESSED THE WORD: " + Arrays.toString(wordGenerator.showWord));
                TryAgainMenu tryAgainMenu = new TryAgainMenu();
                tryAgainMenu.tryAgain();
            }

            System.out.println();
            System.out.println("CURRENT LETTERS USED: " + storeLetter);
            System.out.print("LIVES: ");
            for(int i = 0; i < this.lives; i++) {
                System.out.print("❤");
            }
            System.out.println();
            System.out.println();
            System.out.println(wordGenerator.showWord);

            System.out.println();
            System.out.println("INPUT LETTER: ");
            char input = scanner.nextLine().charAt(0);

            if(storeLetter.contains(String.valueOf(input))) {
                System.out.println("YOU HAVE ALREADY USED THIS LETTER!!!");
                System.out.println();
                guessCorrect = false;

            } else {
                storeLetter.add(String.valueOf(input));

                for (int i = 0; i < wordGenerator.characteriseRandomWord.length; i++) {

                    if (wordGenerator.characteriseRandomWord[i] == input) {
                        wordGenerator.showWord[i] = input;
                        guessCorrect = true;
                    }
                }
            }

            if (!guessCorrect) {
                lives = lives - 1;
            }

            guessCorrect = false;
        }
    }
}
