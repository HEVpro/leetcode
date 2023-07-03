package com.example.testingjava;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        assertEquals("$1000.00", money);
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(-1000, "€");
        assertEquals("-€1000.00", money);
    }

    @Test()
    public void notNullExpectionMoneyTest() {
        Exception exception = assertThrows(
                Exception.class,
                () -> MoneyUtil.format(-1000, null),
                "The symbol cannot be null"
        );

        assertTrue(exception.getMessage().contains("symbol"));
    }
}
