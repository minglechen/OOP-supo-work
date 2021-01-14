package supo3.Question52;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Car A = new Car("aaaa",3);
        Car B = new Car("dd",3);
        Car C = new Car("ccc",3);
        Car D = new Car("ccc",4);

        ArrayList<Car> list1 = new ArrayList(List.of(A,B,C));
        ArrayList<Car> list2 = new ArrayList(List.of(A,B,C,D));
        Collections.sort(list1);
        Collections.sort(list2, new CarComparator());
        System.out.println(list1);
        System.out.println(list2);
    }
}

