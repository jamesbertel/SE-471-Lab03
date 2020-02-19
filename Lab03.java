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
    
    Scanner in = new Scanner(System.in);
    boolean keepadding = true;
    List<Product> biglist = new ArrayList<Product>();

    while(keepadding)
    {
      System.out.println("Enter 1 to add a product, enter 0 to exit");
      int choice = in.nextInt();
      
      switch(choice){
        case 1: 
          Product newprod = new Product();
          System.out.print("Enter Product ID: ");
          newprod.setID(in.nextLong());
          System.out.print("Enter Product name: ");
          newprod.setName(in.nextLine());
          System.out.print("Enter Product price: ");
          newprod.setPrice(in.nextDouble());
          
          biglist.add(newprod);
          break;
        case 0:
          keepadding = false;
          break;
        default: System.out.println("Error: invalid input"); break;
        }
          
      }
    }
}
