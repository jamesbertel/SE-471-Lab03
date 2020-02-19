/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.ArrayList;
import java.util.List;

public class Lab03 {
  
  public static void main(String[] args) {
    
    SortingUtility_IF sortut = new SortingUtilityProxy();
    List<Product> biglist = new ArrayList<>();
    
    Product prod1 = new Product(12345, "Mary", 69.69);
    biglist.add(prod1);

    Product prod2 = new Product(54321, "Daisy", 142.05);
    biglist.add(prod2);

    Product prod3 = new Product(34343, "Danni", 92.34);
    biglist.add(prod3);
    
    Product prod4 = new Product(22468, "Justin", 420.69);
    biglist.add(prod4);
    
    Product prod5 = new Product(46973, "Albany", 99.99);
    biglist.add(prod5);
    
    sortut.sort(biglist, 1);
    sortut.print(biglist, 1);
    
    sortut.sort(biglist, 2);
    sortut.print(biglist, 2);
  }
}
