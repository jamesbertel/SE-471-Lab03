/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.List;

/**
 *
 * @author James
 */
public class SortingUtilityProxy {
  
  public void print(List<Product> items){
    
    System.out.println("Name\t\tPrice");
    System.out.println("---------------------------------------------");
    
    for(int i = 0; i < items.size(); i++)
    {
      System.out.print(items.get(i).getName()+"\t");
      System.out.println(items.get(i).getPrice());
    }
  }
  
  private List<Product> bubbleSort(List<Product> ogList) {
    
    List<Product> items = ogList;
    
    for(int i = 0; i < items.size()-1; i++)
      for(int j = 0; j < items.size()-i-1; j++)
        if(items.get(j+1).getID() < items.get(j).getID())
        {
          //swap items[j+1] and items[i]
          Product temp = items.get(j);
          items.set(j, items.get(j+1));
          items.set(j+1, temp);
        }
    
    return items;
  }
  
  private List<Product> quickSort(List<Product> ogList, int low, int high) {
    List<Product> items = ogList;
    
    Product turnpoint = items.get(high);
    int i = low-1; //index of smaller element
    
    for(int j = low; j < high; j++){
      //if current elem is smaller than turnpoint
      if(items.get(j).getPrice() < turnpoint.getPrice())
      {
        i++;
        //swap items[i] and items[j]
        Product temp = items.get(i);
        items.set(i, items.get(j));
        items.set(j, temp);
      }
    }   
    return items;
  }
  
  public List<Product> sort(List<Product> items, int sortingApproach){
   
    List<Product> temp = null;
    
    switch (sortingApproach) {
      case 1:
        temp = bubbleSort(items);
        break;
      case 2:
        temp = quickSort(items, 0, (items.size()-1));
        break;
      default:
        System.out.println("ERROR: bad sortingApproach");
        break;
    }
    
    return temp;
  }//end sort()
}