package supo2.Question37;

public class C extends B{
    public int value3;
    public C(int i, int j, int k) {
        super(i, j);
        value3 = k;
    }



    public static void main(String[] args) {
        C o = new C(1,2,3);

        System.out.println(o.value1);
        System.out.println(o.value2);
        System.out.println(o.value3);
    }
}
