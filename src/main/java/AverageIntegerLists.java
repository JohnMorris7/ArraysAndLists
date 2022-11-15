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
        if (count(aa) == 0 && sum(aa) == 0) {
            return 0;
        }
        return sum(aa) / count(aa);
    }
}
