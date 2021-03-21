package org.phoenix.goldmansachs;

import org.junit.jupiter.api.Test;

import java.util.List;

class PrintAnagramsTogetherTest {

    private final PrintAnagramsTogether test = new PrintAnagramsTogether();

    @Test
    void anagrams() {
        String[] words = new String[]{"act", "god", "cat", "dog", "tac"};
        List<List<String>> res = test.Anagrams(words);
        System.out.println(res);
    }
}