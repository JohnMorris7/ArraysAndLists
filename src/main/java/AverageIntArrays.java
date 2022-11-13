public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int counter = 0;
        for (double v : aa) {
            counter += v;
        }

        return counter;
    }

    public int average(int[] aa) {

        return sum(aa) / count(aa);
    }

}
