
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class CafeUtil {
    
    public int getStreakGoal(){
    int num = 10, sum = 0;
    for (int i = 0; i < num; i++){
         sum =sum+i; 
    
}
    return sum ;
}
    public double getOrderTotal(double[] prices){
    double sum =0 ;double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        
    for (double i = 0; i < lineItems.length ; i++){
         sum =sum+i; 

    }
    return sum ;

}
    public void displayMenu(ArrayList<String> menuItems){

        menuItems.add("drip coffee");
        menuItems.add("cappucino");
        menuItems.add("latte");
        menuItems.add("mocha");

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("please enter youre name");
        String userName = System.console().readLine();
        System.out.println("hello " + userName);
        customers.add(userName);
        System.out.println(customers);
        System.out.println("Hi "+userName + "There are: " +customers.size() + "ahead of you");
        
 
    }
    }



