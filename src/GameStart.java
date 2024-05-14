import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class GameStart {

    String[] words = {"cat", "dog", "mouse", "llama", "horse"};

    public void play() {
        int lives = 8;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("LIVES: " + lives);

            generateWord();

            System.out.println();
            System.out.println("INPUT LETTER: ");
            String input = scanner.nextLine();
            char chosenLetter = input.charAt(0);

        }
    }

    private void generateWord() {
        int randomiseTheWord = (int)(Math.random() * words.length);
        char[] characteriseRandomWord = words[randomiseTheWord].toCharArray();

        int lengthOfWord = characteriseRandomWord.length;
        char[] showWord = new char[lengthOfWord];

        System.out.println();
        Arrays.fill(showWord, '_');
        System.out.println(showWord);

    }

}
