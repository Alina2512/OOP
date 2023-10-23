package hw1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HotBeverageVendingMachine machine = new HotBeverageVendingMachine();
        machine.addHotBeverage(new HotBeverage("Capucino", 100, 80));
        machine.addHotBeverage(new HotBeverage("Capucino", 100, 80));
        machine.addHotBeverage(new HotBeverage("Americano", 90, 85));
        machine.addHotBeverage(new HotBeverage("Hot Water", 30, 40));
        machine.addHotBeverage(new HotBeverage("Hot Water", 30, 60));
        machine.addHotBeverage(new HotBeverage("Hot Water", 30, 90));

        Product beverage = machine.getProduct("Americano");
        System.out.println(beverage);

        beverage = machine.getProduct("Americano");
        System.out.println(beverage);

        beverage = machine.getProduct("Capucino");
        System.out.println(beverage);

        beverage = machine.getProduct("Capucino");
        System.out.println(beverage);

        beverage = machine.getProduct("Capucino");
        System.out.println(beverage);

        HotBeverage hotWater = machine.getHotBeverage("Hot Water", 40);
        System.out.println(hotWater);

    }

}