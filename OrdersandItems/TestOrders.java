
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        Items item1 = new Items("Mocha", 5.3);
        Items item2 = new Items("Latte", 6.2);
        Items item3 = new Items("drip", 4.2);
        Items item4 = new Items("coffee", 5.2);

        Order order1 = new Order("Cindhuri",true);
        Order order2 = new Order("Jimmy",true);
        Order order3 = new Order("Noah",true);
        Order order4 = new Order("Sam",true);
        order1.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Ready: %s\n", order4.total);

    }
}