package Mengjia;

import java.util.*;

public class Q4 {

    public boolean alienLanguage(String[] words, String order){
        int[] orderMap = new int[26];
        int rank = 1;
        for(Character c: order.toCharArray()){
            orderMap[c -'a'] = rank++;
        }
        for(int i = 0; i < words.length - 1; i++){
            String word1 = words[i];
            String word2 = words[i + 1];

            if(word1.length() > word2.length() && word1.startsWith(word2)){
                return false;
            }

            int index = 0;

            while(index < word1.length() && index < word2.length()
                    && word1.charAt(index) == word2.charAt(index)){
                index++;
            }

            if(index < word1.length() && index < word2.length()
                    && orderMap[word1.charAt(index) - 'a'] > orderMap[word2.charAt(index) - 'a']){
                return false;
            }
        }

        return true;
    }

}
