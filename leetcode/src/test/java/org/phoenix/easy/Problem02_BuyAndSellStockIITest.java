package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_BuyAndSellStockIITest {

    private final Problem02_BuyAndSellStockII test = new Problem02_BuyAndSellStockII();

    @Test
    void maxProfit() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(7, test.maxProfit(arr));
    }
}