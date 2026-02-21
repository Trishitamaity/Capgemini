package DSA_Day_5;
import java.util.*;

public class Sample_Java {
    public static void main(String[] args) {
        String[] words = {"eat", "ate", "tam", "tab", "occur", "tea", "mat"};
        Sample_Java obj = new Sample_Java();
        List<List<String>> lists = obj.groupAnagram(words);
        System.out.println(lists);
    }
    public List<List<String>> groupAnagram(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}