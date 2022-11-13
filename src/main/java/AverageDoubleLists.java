import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {

        return (double) aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        int counter = 0;
        for (Double aDouble : aa) {
            counter += aDouble;

        }
        return (double) counter;
    }
    public Double average(ArrayList<Double> aa) {
        return sum(aa) / count(aa);
    }

}
