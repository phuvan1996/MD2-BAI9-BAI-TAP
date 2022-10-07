package Baitap3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translateTestFizz() {
        {
            String result = FizzBuzzTranslate.translate(3);
            assertEquals("Fizz", result);
        }
    }
    @Test
    void translateTestBuzz(){
        String result = FizzBuzzTranslate.translate(5);
        assertEquals("Buzz",result);
    }
    @Test
    void translateFizzBuzzTest(){
        String result = FizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz",result);
    }
}