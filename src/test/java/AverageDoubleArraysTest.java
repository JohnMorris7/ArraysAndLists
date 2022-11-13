import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {
    AverageDoubleLists averageDoubleLists;
    ArrayList<Double> aalist;

    @BeforeEach
    void setUp() {
        averageDoubleLists = new AverageDoubleLists();
        aalist = new ArrayList<>();
        aalist.add(5.0);
        aalist.add(10.0);
        aalist.add(15.0);
        aalist.add(20.0);
        aalist.add(25.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        Double actual = averageDoubleLists.count(aalist);
        Double expected = 5.0;
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        Double actual = averageDoubleLists.sum(aalist);
        Double expected = 75.0;
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        Double actual = averageDoubleLists.average(aalist);
        Double expected = 15.0;
        assertEquals(expected, actual);
    }
}