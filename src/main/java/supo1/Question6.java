package supo1;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(lowestCommon(14,25));
    }

    static int lowestCommon(long i, long j){
        int counter = 0;
        while (true){
            if (i % 2 == j % 2) break;
            i = i>>1;
            j = j>>1;
            counter ++;
        }
        return counter;
    }
}
