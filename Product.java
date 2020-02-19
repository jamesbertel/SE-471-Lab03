package lab03;

public class Product {
  
  private final long ID;
  private String name;
  private double price;
  
  public Product(long pID, String pName, double pPrice){
    this.ID = pID;
    this.name = pName;
    this.price = pPrice;
  }
  
  public final long getID() {return ID;}
  public String getName() {return name;}
  public double getPrice() {return price;}
}
