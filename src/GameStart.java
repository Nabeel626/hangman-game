import java.util.Scanner;

public class GameStart {

    private int lives = 8;
    private boolean guessCorrect = false;

    WordGenerator wordGenerator = new WordGenerator();
    Scanner scanner = new Scanner(System.in);

    public void play() {

        while (!guessCorrect && lives > 0) {
            System.out.println();
            System.out.println("LIVES: " + lives);

            wordGenerator.generateWord();

            System.out.println();
            System.out.println("INPUT LETTER: ");
            char input = scanner.nextLine().charAt(0);

            for(int i = 0; i < wordGenerator.characteriseRandomWord.length; i++) {

                if(wordGenerator.characteriseRandomWord[i] == input) {
                    wordGenerator.showWord[i] = input;

                    System.out.println(wordGenerator.showWord);

//                    guessCorrect = true;
                }
            }

            if(!guessCorrect) {
                lives = lives - 1;
            }
        }
    }
}
