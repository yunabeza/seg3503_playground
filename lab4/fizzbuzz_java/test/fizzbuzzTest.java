
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class fizzbuzzTest {

    @Test
    public void test_1(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("Buzz", f1.FizzBuzzOrNum(5));
    }

    @Test
    public void test_2(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("Fizz", f1.FizzBuzzOrNum(21));
    }
    @Test
    public void test_3(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("105", f1.FizzBuzzOrNum(105));
    }
}
