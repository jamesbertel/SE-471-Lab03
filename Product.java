/*
 * 
 */
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
  //public final void setID(long aID) {ID = aID;}
  public String getName() {return name;}
  public void setName(String name) {this.name = name;}
  public double getPrice() {return price;}
  public void setPrice(double price) {this.price = price;}
}
