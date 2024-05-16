import java.util.Arrays;

public class WordGenerator {

    public String[] words = {"cat", "dog", "mouse", "llama", "horse", "giraffe"};

    protected int randomiseTheWord = (int)(Math.random() * words.length);
    protected char[] characteriseRandomWord = words[randomiseTheWord].toCharArray();
    protected int lengthOfWord = characteriseRandomWord.length;
    protected char[] showWord = new char[lengthOfWord];

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
