package supo3.Question52;

public class Car implements Comparable<Car>{
    private String manufacturer;
    private int age;

    public Car(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int compareTo(Car o) {
        return getManufacturer().compareTo(o.getManufacturer());
    }

    @Override
    public String toString() {
        return manufacturer + ": " + age;
    }
}
