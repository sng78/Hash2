import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordsSet = new HashSet<>();

    public  WordsChecker(String text) {
        this.text = text;
        String[] wordsArray = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(wordsSet, wordsArray);
    }

    public boolean hasWord(String word) {
        return wordsSet.contains(word);
    }
}