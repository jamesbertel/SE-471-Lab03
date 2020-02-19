package lab03;

import java.util.List;

public class SortingUtility {//implements SortingUtility_IF {
  
  private List<Product> listOfProducts;
  
  
  private List<Product> bubbleSort(List<Product> ogList) {
    
    List<Product> items = ogList;
    
    for(int i = 0; i < items.size()-1; i++)
    {
      for(int j = 0; j < items.size()-i-1; j++)
        if(items.get(j+1).getID() < items.get(j).getID())
        {
          Product temp = items.get(j);
          items.set(j, items.get(j+1));
          items.set(j+1, temp);
        }
    }
    return items;
  }//end bubblesort() id, then name and price
  
  
  private List<Product> quickSort(List<Product> ogList, int low, int high) {
    
    List<Product> items = ogList;
    
    Product turnpoint = items.get(high);
    
    for(int i = 0; i < high; i++)
      for(int j = i+1; j < high+1; j++){
        if(0 < items.get(i).getName().compareTo(items.get(j).getName())){  
          Product temp = items.get(i);
          items.set(i, items.get(j));
          items.set(j, temp);
        }
      }
    
    return items;
  }//end quickSort(), by name, then id and price
  
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
