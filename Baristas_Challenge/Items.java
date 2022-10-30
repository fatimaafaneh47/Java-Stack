public class Items{
    private String name ;
    private double price;

    public void setMyName(String myName){
        this.name = myName;
    }
    public String getMyName(){
        return this.name;
    }
    public void setPrice(double Price){
        this.price = Price ;
    }
    public double getPrice(){
        return this.price ;
    }


    public Items(){ 

  }
  public Items(String name, double price){
        this.name = name;
        this.price =price;
    }

}
