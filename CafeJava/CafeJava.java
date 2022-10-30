public class CafeJava {
    public static void main(String[] args) {
        
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        
        double mochaPrice = 7.5;
        double dripcoffee= 9.6;
        double latte = 8.6;
        double cappuccino =3.8;
        
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        if (isReadyOrder4){
            System.out.println("Noah order is ready "+ displayTotalMessage + latte );
        }
        else{
            System.out.println("order is not ready");
        }
        if(isReadyOrder2){
            System.out.println("Sam Ordered" + displayTotalMessage + latte*2 );
        }
        else{
            System.out.println("order is not ready");
        }
    
       
        System.out.println(generalGreeting + customer1); 
    	System.out.println(customer2 +" "+ "ordered dripcoffee");
        System.out.println(customer3 +" "+ "ordered latte");
        System.out.println(customer4 +" "+ "ordered cappuccino");
        System.out.println("sorry for the wrong charge"+" "+ displayTotalMessage + 5.6 );
       


    }
}
