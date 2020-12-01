package supo1;

public class Question5 {
    public static void main(String[] args) {
        something(100000);
    }
    static void something(int n){
        if (n == 0){
            return;
        } else {
            something(n-1);
        }
    }
}
