package supo2.Question36;

public class NinjaEmployee extends Employee implements NinjaInterface{
    Ninja ninja = new Ninja();

    public void doStuff() {
        ninja.doStuff();
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("deleted");
    }

    public static void main(String[] args) {
        NinjaEmployee ninjaEmployee = new NinjaEmployee();
        for (int i = 0; i < 1000000; i++){
            ninjaEmployee = new NinjaEmployee();
        }
        ninjaEmployee.doStuff();
        ninjaEmployee.doStuff2();

    }
}
