import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int counter = 0;
        for(double v : aa) {
            counter += v;
        }
        return counter;
    }

    public int average(ArrayList<Integer> aa) {
        return sum(aa) / count(aa);
    }
}
