
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class fizzbuzzTest {

    @Test
    public void test_1(){
        fizzbuzz f1 = new fizzbuzz();
        assertEquals("Buzz", f1.FizzBuzzOrNum(5));
    }
}
