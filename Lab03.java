/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab03 {
  
  public static void main(String[] args) {
    
////    Scanner in = new Scanner(System.in);
//    boolean keepadding = true;
    SortingUtilityProxy sortut = new SortingUtilityProxy();
    List<Product> biglist = new ArrayList<Product>();
    
    Product prod1 = new Product(12345, "Mary", 69.69);
    biglist.add(prod1);
    //sortut.print(biglist);
    Product prod2 = new Product(54321, "Daisy", 42.05);
    biglist.add(prod2);
    //sortut.print(biglist);
    Product prod3 = new Product(34343, "Jane", 12.34);
    biglist.add(prod3);
    
    Product prod4 = new Product(22468, "Justin", 420.69);
    biglist.add(prod4);
    
    Product prod5 = new Product(46973, "Albany", 99.99);
    biglist.add(prod5);
    
    sortut.print(biglist, 2);

    List<Product> newlist = sortut.sort(biglist, 2);
    sortut.print(newlist, 2);

//    while(keepadding)
//    {
//      System.out.println("Enter 1 to add a product, enter 0 to exit");
//      int choice = in.nextInt();
//      
//      switch(choice){
//        case 1: 
//          Product newprod = new Product();
//          System.out.print("Enter Product ID: ");
//          newprod.setID(in.nextLong());
//          System.out.print("Enter Product name: ");
//          newprod.setName(in.nextLine());
//          System.out.print("Enter Product price: ");
//          newprod.setPrice(in.nextDouble());
//          
//          biglist.add(newprod);
//          break;
//        case 0:
//          keepadding = false;
//          break;
//        default: System.out.println("Error: invalid input"); break;
//        }
//          
//      }

    }
}
