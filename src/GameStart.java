import java.util.Scanner;

public class GameStart {

    private int lives = 8;
    private boolean guessCorrect = false;
    private boolean start = true;

    WordGenerator wordGenerator = new WordGenerator();
    Scanner scanner = new Scanner(System.in);

    public void play() {

        wordGenerator.generateWord();

        while (start) {
            if (lives == 0 || lives < 0) {
                System.out.println();
                System.out.println("YOU HAVE RUN OUT OF LIVES :( ");
                start = false;
                Menu menu = new Menu();
                menu.state();
            }

            System.out.println();
            System.out.println("LIVES: " + lives);

            System.out.println(wordGenerator.showWord);

            System.out.println();
            System.out.println("INPUT LETTER: ");
            char input = scanner.nextLine().charAt(0);

            for (int i = 0; i < wordGenerator.characteriseRandomWord.length; i++) {

                if (wordGenerator.characteriseRandomWord[i] == input) {
                    wordGenerator.showWord[i] = input;
                    guessCorrect = true;
                }
            }

            if(!guessCorrect) {
                lives = lives - 1;
            }
        }
    }
}
