package supo3.Question51;

import supo2.Question37.A;

import java.util.*;

public class StudentInfo {
    public TreeMap<String,Double> students = new TreeMap<>();
    public List<Map.Entry<String, Double>> list;
    public StudentInfo(TreeMap<String, Double> map){
        students.putAll(map);
        list = new ArrayList<>(students.entrySet());
        list.sort(Map.Entry.<String, Double>comparingByValue().reversed());
    }

    public ArrayList<String> getStudents(){
        ArrayList<String> list = new ArrayList<>();
        Set<String> keys = students.keySet();
        list.addAll(keys);
        Collections.sort(list);
        return list;
    }

    public double getMedian(){
        if (list.size() %2 == 0) return (list.get(list.size()/2).getValue() + list.get(list.size()/2-1).getValue())/2.0;
        else return list.get(list.size()/2).getValue();
    }

    public ArrayList<String> topStudents(double top){
        if (top < 0 || top > 1) throw new IllegalArgumentException();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < (int) (top * list.size()); i++){
            result.add(list.get(i).getKey());
        }
        return result;
    }

}

