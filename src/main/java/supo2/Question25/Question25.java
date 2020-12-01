package supo2.Question25;

public class Question25 {
    static int value = 1;

    public static void main(String[] args) {
        System.out.println(value);
    }
}

class Q25{
    int value2 = Question25.value;

}

class Q25_2 extends Question25{

    int value3 = Question25.value;
}
