import Codewars.BrokenSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BrokenSequenceTest {

    @Test
    public void findMissingNumberTest(){
        BrokenSequence brokenSequence = new BrokenSequence();

        assertEquals(4,brokenSequence.findMissingNumber2("1 2 3 5"));

        assertEquals(3,brokenSequence.findMissingNumber2("1 2 4 5"));

        assertEquals(2,brokenSequence.findMissingNumber2("1 3 4 5"));

        assertEquals(1,brokenSequence.findMissingNumber2("2 3 4 5"));

        assertEquals(0, brokenSequence.findMissingNumber2(""));
    }
}
