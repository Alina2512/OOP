package hw1;

public class HotBeverage extends Product{
    private int temperature;
    public HotBeverage(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotBeverage{" +
                 "name = " + super.getName() +
                ";cost = " + super.getCost() +
                ";temperature = " + this.temperature +
                '}';
    }
}