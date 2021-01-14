package supo3.Question51;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> info = new TreeMap<>();
        info.put("Alice",90.0);
        info.put("Bob",80.0);
        info.put("Tom",75.0);
        info.put("Peter",90.0);

        StudentInfo studentInfo = new StudentInfo(info);

        System.out.println(studentInfo.getStudents());
        System.out.println(studentInfo.getMedian());
        System.out.println(studentInfo.topStudents(0.5));
    }
}
