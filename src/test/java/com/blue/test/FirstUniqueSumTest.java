package com.blue.test;

import com.blue.test.service.FirstUniqueSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueSumTest {



    @Test
    void getSum() {
        assertEquals(FirstUniqueSum.getSum(new int[]{1, 31, 5, 5, 5, 27, 12, 26, 31, 12, 26, 3}),
                31);
    }
}