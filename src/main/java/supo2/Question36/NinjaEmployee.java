package supo2.Question36;

public class NinjaEmployee extends Employee implements NinjaInterface{
    Ninja ninja = new Ninja();

    public void doStuff() {
        ninja.doStuff();
    }



    public static void main(String[] args) {
        NinjaEmployee ninjaEmployee = new NinjaEmployee();
        ninjaEmployee.doStuff();
        ninjaEmployee.doStuff2();

    }
}
