import java.util.Arrays;

public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {

        return aa.length;
    }

    public int sum(double[] aa) {
        int counter = 0;
        for (double v : aa) {
            counter += v;

        }

        return counter;
    }

    public int average(double[] aa) {

        return sum(aa) / count(aa);
    }

}
