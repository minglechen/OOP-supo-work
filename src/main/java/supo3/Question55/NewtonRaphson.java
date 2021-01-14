package supo3.Question55;

public class NewtonRaphson {
    public static double Compute(double Number) {
        int maxCalc = 1000000000;
        double sqrRoot;
        double temp = Number/2;
        int counter = 0;
        while (true) {
            sqrRoot = temp - (temp * temp - Number) / (2 * temp);
            if (Math.abs(temp - sqrRoot) < 0.000001) break;
            temp = sqrRoot;
            counter ++;
            if (counter > maxCalc) throw new ArithmeticException();

        }
        return sqrRoot;
    }

    public static void main(String[] args) {
        try{
            System.out.println(Compute(75483927354356543543234574839475299523452345.0));
        } catch (ArithmeticException e){
            System.out.println("result didn't converge for 1000000000 calculations");
        }

    }
}
