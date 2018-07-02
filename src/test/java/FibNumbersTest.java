import Codewars.ProductOfConsecutiveFibNumbers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FibNumbersTest {

    @Test
    public void productFibTest() {

        assertThat(new long[]{55, 89, 1},
                is(ProductOfConsecutiveFibNumbers.productFib(4895)));

        assertThat(new long[]{89, 144, 0},
                is(ProductOfConsecutiveFibNumbers.productFib(5895)));

        assertThat(new long[]{1, 1, 1},
                is(ProductOfConsecutiveFibNumbers.productFib(2)));

        assertThat(new long[]{13, 21, 1},
                is(ProductOfConsecutiveFibNumbers.productFib(273)));
    }
}
