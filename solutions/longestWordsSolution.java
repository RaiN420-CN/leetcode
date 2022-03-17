package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//720. 词典中最长的单词
public class longestWordsSolution {
    public String longestWord(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int max = 0;
        for (String word : words) {
            map.put(word, word.length());
            if(word.length() > max){
                max = word.length();
            }
        }
        for(;max > 1 ; max--){

        }

        return "";
    }
    public static void main(String[] args) {
        String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        longestWordsSolution solution = new longestWordsSolution();
    }
}
