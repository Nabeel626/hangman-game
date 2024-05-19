import java.util.Arrays;

public class WordGenerator {

    final String[] easyWords = {"cat", "dog"};
    final String[] mediumWords = {"mouse", "llama", "horse"};
    final String[] hardWords = {"hippopotamus"};

    protected int randomiseTheWord;
    protected char[] characteriseRandomWord;
    protected int lengthOfWord;
    protected char[] showWord;

    String difficulty;

    public void getDifficultyInput(String checkDifficulty) {
        difficulty = checkDifficulty;

        if(difficulty == "easy") {
            randomiseTheWord = (int)(Math.random() * easyWords.length);
            characteriseRandomWord = easyWords[randomiseTheWord].toCharArray();
            lengthOfWord = characteriseRandomWord.length;
            showWord = new char[lengthOfWord];

        } else if (difficulty == "medium") {
            randomiseTheWord = (int)(Math.random() * mediumWords.length);
            characteriseRandomWord = mediumWords[randomiseTheWord].toCharArray();
            lengthOfWord = characteriseRandomWord.length;
            showWord = new char[lengthOfWord];

        } else if (difficulty == "hard") {
            randomiseTheWord = (int)(Math.random() * hardWords.length);
            characteriseRandomWord = hardWords[randomiseTheWord].toCharArray();
            lengthOfWord = characteriseRandomWord.length;
            showWord = new char[lengthOfWord];
        }
    }

    public void generateWord() {
        System.out.println();
        Arrays.fill(showWord, '_');
    }

    public static boolean completedWord(char[] array) {
        boolean condition = true;

        for (char word : array) {
            if (word == '_') {
                condition = false;
                break;
            }
        }
        return condition;
    }
}
