/**
 * Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of
 * their appearance in the original array. Look at the sample case for clarification.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * words[] = {act,god,cat,dog,tac}
 * Output:
 * god dog
 * act cat tac
 * Explanation:
 * There are 2 groups of
 * anagrams "god", "dog" make group 1.
 * "act", "cat", "tac" make group 2.
 * Constraints:
 * 1<=N<=100
 */
package org.phoenix.goldmansachs;

import java.util.*;

public class PrintAnagramsTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        // HashMap to store the anagram words with a common
        // key created by sorting the word
        Map<String, List<String>> map = new HashMap<>();
        // looping over the given array
        for (String str : string_list) {
            // converting the string array to char array
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            // If the key word is not in map then add a new list
            // with current word from the array else get the list and add
            // word to the existing list
            if (!map.containsKey(newWord)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(newWord, list);
            } else {
                map.get(newWord).add(str);
            }
        }
        // List to store the result
        return new ArrayList<>(map.values());
    }
}
