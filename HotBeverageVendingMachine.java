package hw1;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine{
    List<HotBeverage> hotBeverages;

    public HotBeverageVendingMachine() {
        hotBeverages = new ArrayList<HotBeverage>();
    }

    public HotBeverageVendingMachine(List<HotBeverage> products) {
        this.hotBeverages = products;
    }

    public List<HotBeverage> getHotBeverages() {
        return hotBeverages;
    }

    public void setHotBeverage(List<HotBeverage> hotBeverages) {
        this.hotBeverages = hotBeverages;
    }

    @Override
    public Product getProduct(String name) {
        int counter = 0;
        for (HotBeverage item : hotBeverages) {
            if(item.getName().equals(name)) {
                HotBeverage tmp = item;
                this.hotBeverages.remove(counter);
                return item;
            }
            counter ++;
        }
        return null;
    }
    @Override
    public HotBeverage getHotBeverage(String name, int temperature) {
        int counter = 0;
        for (HotBeverage item : hotBeverages) {
            if(item.getName().equals(name) && (item.getTemperature() == temperature)) {
                HotBeverage tmp = item;
                this.hotBeverages.remove(counter);
                return item;
            }
            counter ++;
        }
        return null;
    }
    public void addHotBeverage(HotBeverage hotBeverages){
        this.hotBeverages.add(hotBeverages);
    }
}