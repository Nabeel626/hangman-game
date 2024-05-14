import java.util.Arrays;

public class WordGenerator {

    public String[] words = {"cat", "dog", "mouse", "llama", "horse"};

    protected int randomiseTheWord = (int)(Math.random() * words.length);
    protected char[] characteriseRandomWord = words[randomiseTheWord].toCharArray();
    protected int lengthOfWord = characteriseRandomWord.length;
    protected char[] showWord = new char[lengthOfWord];

    public void generateWord() {
        System.out.println();
        Arrays.fill(showWord, '_');
        System.out.println(showWord);
    }

}
