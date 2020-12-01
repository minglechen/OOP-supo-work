package supo2.Question30;

public class NSStudent extends Student{
    @Override
    boolean pass() {
        return ticks >= 10;
    }
}
