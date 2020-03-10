import org.junit.Assert;
import org.junit.Test;

public class FibTests {

    @Test
    public void basicTest(){
        int expected = 8;
        Assert.assertEquals(expected, Fibonacci.fib(6));
    }
}
