package supo3.Question47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question47 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.printf("%f %f %f", average1(list),
        average2(list),
        average3(list));

    }

    public static float average1(List<Integer> list){
        float sum = 0;
        for(int i = 0; i < list.size();++i){
            sum += list.get(i);
        }
        return sum/list.size();
    }

    public static float average2(List<Integer> list){
        float sum = 0;
        for (int i:list) {
            sum += i;
        }
        return sum/list.size();
    }

    public static float average3(List<Integer> list) {
        float sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum/list.size();
    }
}
