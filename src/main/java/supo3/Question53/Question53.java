package supo3.Question53;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Question53 {
    public static void main(String[] args) {
        ArrayList<Row> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/supo3/Question53/test.txt"));
            String line = reader.readLine();
            while(line != null){
                String[] row = line.split(",");
                int x = Integer.parseInt(row[0]);
                int y = Integer.parseInt(row[1]);
                list.add(new Row(x,y));
                line = reader.readLine();
            }
            reader.close();
            Collections.sort(list);
            for(Row r : list){
                System.out.println(r);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
