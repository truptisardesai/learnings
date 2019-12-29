package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author trupti.sardesai
 * 
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.

Example 1:

Input: A = "this apple is sweet", B = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: A = "apple apple", B = "banana"
Output: ["banana"]
 
 *
 */

class uncommonWordsFromSenteence {
    public static String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] words_A = A.split(" ");
        String[] words_B = B.split(" ");
        
        for (String word_A: words_A){
            if(!map.containsKey(word_A))
                map.put(word_A, 1);
            else
                map.put(word_A, map.get(word_A)+1);
        }
        for (String word_B: words_B){
            if(!map.containsKey(word_B))
                map.put(word_B, 1);
            else
                map.put(word_B, map.get(word_B)+1);
        }
        List<String> result=new ArrayList<String>();
        for (Map.Entry mapElement : map.entrySet()) {  
            if((int)mapElement.getValue()==1){
                result.add((String) mapElement.getKey());
            }
        }
        return result.toArray(new String[result.size()]);
    }
    
    public static void main(String args[]) {
    	String A = "this apple is sweet";
    	String B = "this apple is sour";
    	String[] r = uncommonFromSentences(A,B);
    	for(int i=0;i<r.length;i++)
    		System.out.println(r[i]);
    	
    }
}