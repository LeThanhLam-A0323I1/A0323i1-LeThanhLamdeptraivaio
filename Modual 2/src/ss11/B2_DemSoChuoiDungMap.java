package ss11;
import java.util.Map;
import java.util.TreeMap;
public class B2_DemSoChuoiDungMap {
    public static void countWords(String text) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String formattedWord = word.toLowerCase();
            if (wordCountMap.containsKey(formattedWord)) {
                int count = wordCountMap.get(formattedWord);
                wordCountMap.put(formattedWord, count + 1);
            } else {
                wordCountMap.put(formattedWord, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "This is a sample text sample to demonstrate word counting program";
        countWords(text);
    }
}
