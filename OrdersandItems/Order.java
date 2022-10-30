import java.util.ArrayList;
public class Order{
    String name ;
    double total;
    boolean ready;
    ArrayList <Items> orderItems;
    public Order(String name, boolean ready){
        this.name = name;
        this.ready=ready;
        this.orderItems = new ArrayList <Items>();
    }
    
    public void addItem(Items item){
        this.orderItems.add(item);
        this.total += item.price;
    }

}

