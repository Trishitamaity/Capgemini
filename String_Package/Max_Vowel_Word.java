package String_Package;

public class Max_Vowel_Word {
    public static void main(String[] args) {
        String s = "I love programming";
        String[] words = s.split(" ");
        int maxVowels = 0;
        String result = "";
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String word = words[i].toLowerCase();
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            if (count > maxVowels) {
                maxVowels = count;
                result = words[i];
            }
        }
        System.out.println(result);
    }
}