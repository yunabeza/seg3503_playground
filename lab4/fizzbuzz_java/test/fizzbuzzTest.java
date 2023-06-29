
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
        assertEquals("FizzBuzz", f1.FizzBuzzOrNum(105));
    }
    @Test
    public void test_4(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("202", f1.FizzBuzzOrNum(202));
    }
    @Test
    public void test_5(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("3 4 5 6 ", f1.generator(3, 6));
    }
}
