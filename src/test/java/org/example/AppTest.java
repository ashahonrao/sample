package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AppTest {

    App app;

    @BeforeEach
    public void init(){
       app = new App();

    }

      @Test
    public void reverseStringTest(){
        String str = "abcde";
        String expectedReverseString = "edcba";
        String reversString = app.reverseString(str);
        assertEquals(expectedReverseString,reversString);
    }

    @Test()
    public void reverseStringTest_With_EmptyString(){
        String str = "";
        assertThrows(IllegalArgumentException.class, ()-> app.reverseString(str));
    }

    @Test()
    public void reverseStringTest_WithNull(){
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> app.reverseString(str));

    }
}