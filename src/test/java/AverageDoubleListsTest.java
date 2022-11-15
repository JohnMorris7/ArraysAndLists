import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        AverageDoubleLists averageDoubleLists = new AverageDoubleLists();
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(2.0, 4.0, 6.0));
        Double expected = 3.0;
        Double actual = averageDoubleLists.count(a);
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        AverageDoubleLists averageDoubleLists = new AverageDoubleLists();
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(2.0, 4.0, 6.0));
        Double expected = 12.0;
        Double actual = averageDoubleLists.sum(a);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        AverageDoubleLists averageDoubleLists = new AverageDoubleLists();
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(2.0, 4.0, 6.0));
        Double expected = 4.0;
        Double actual = averageDoubleLists.average(a);
        assertEquals(expected, actual);
    }
}