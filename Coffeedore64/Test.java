import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        CoffeeKiosek coffee = new CoffeeKiosek();
        coffee.addMenuItem("Capputchino", 5.5);
        coffee.addMenuItem("Tea", 2.5);
        coffee.addMenuItem("Espresso", 2.0);
        coffee.addMenuItem("Cola", 2.0);
        coffee.newOrder();
    }
}
