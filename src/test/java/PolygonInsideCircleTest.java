import Codewars.PolygonInsideCircle;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PolygonInsideCircleTest {

    @Test
    public void areaOfPolygonInsideCircleTest(){

        assertThat(92.053,
               is(PolygonInsideCircle.areaOfPolygonInsideCircle(5.8, 7)));

        assertThat(0.0,
                is(PolygonInsideCircle.areaOfPolygonInsideCircle(0, 0)));

        assertThat(11.691,
                is(PolygonInsideCircle.areaOfPolygonInsideCircle(3, 3)));

        assertThat(38.042,
                is(PolygonInsideCircle.areaOfPolygonInsideCircle(4, 5)));
    }
}
