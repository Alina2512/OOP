
package hw1;
import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);

    HotBeverage getHotBeverage(String name, int temperature);
}