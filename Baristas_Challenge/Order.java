import java.util.ArrayList;
public class Order{
    private String name ;
    private double total;
    private boolean ready;
    ArrayList <Items> orderItems;

    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    public Order(String name, boolean ready){
        this.name = name;
        this.ready=ready;
        this.orderItems = new ArrayList <Items>();
    }
    
    public void addItem(Items item){
        this.orderItems.add(item);
        this.total += item.getPrice();;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    public void setTotal(double newTotal){
        this.total = newTotal;
    }
    public double getTotal(){
        return this.total;
    }
    public void setReady(boolean newReady){
        this.ready = newReady;
    }
    public boolean getReady(){
        return this.ready;
    }
    public void getStatusMessage(){
        boolean ready=true ;
        if (ready){
            System.out.println("youre order is ready");
        }
        else{
            System.out.println("Thank you for waiting.Youre order will be ready soon");
        }
        
    }
    public void display() {
        for (Items item :  this.orderItems) {
        System.out.println("customer"+" "+ getName() +"  price"+" "+ item.getPrice());
        }
    }
    
    public double getOrderTotal() {
        return this.total;
  }
    
}


