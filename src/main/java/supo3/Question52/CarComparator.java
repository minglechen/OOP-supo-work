package supo3.Question52;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int comp = o1.compareTo(o2);
        if (comp != 0){
            return comp;
        }
        return o1.getAge() - o2.getAge();
    }
}
