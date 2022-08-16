import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordsSet = new HashSet<>();

    public  WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(wordsSet, wordsArray);
        return wordsSet.contains(word);
    }
}