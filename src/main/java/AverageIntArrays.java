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
        if (sum(aa) == 0 && count(aa) == 0) {
            return 0;
        }
        return sum(aa) / count(aa);
    }

}
