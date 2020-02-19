/*
 * 
 */
package lab03;

public class Product {
  
  private static long ID;
  private String name;
  private double price;
  
  public static long getID() {return ID;}
  public static void setID(long aID) {ID = aID;}
  public String getName() {return name;}
  public void setName(String name) {this.name = name;}
  public double getPrice() {return price;}
  public void setPrice(double price) {this.price = price;}
}
