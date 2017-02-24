/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
import java.io.*;
import java.util.*;

class Solution {
 
  public static void main(String[] args) {
    String[] employeesInput = {
      "1,Richard,Engineering",
      "2,Erlich,HR",
      "3,Monica,Business",
      "4,Dinesh,Engineering",
      "6,Carla,Engineering"
    };


    String[] friendshipsInput = {
      "1,2",
      "1,3",
      "2,4"
    };
    
    Map<Integer, ArrayList<Integer>> friendsMap = findFriends(friendshipsInput);
    
    for (String employee : employeesInput) {
      
      int employeeId = Character.getNumericValue(employee.charAt(0));


      System.out.print(employeeId + ": ");
      
      
      ArrayList<Integer> friendsList = friendsMap.get(employeeId);
      
      
      if(friendsList != null)
      {
        for(int friend: friendsList)
        {
          System.out.print(friend + " ");
        }
       System.out.println("");
       
      }
      
      else
      {
        
       System.out.println("None"); 
      }
      
    }
    
  }


  public static Map<Integer, ArrayList<Integer>> findFriends(String[] friendshipsInput)
  {
    //int employeesLength = employeesInput.length;
    int friendsLength = friendshipsInput.length;

    //build hash table for friendshipsInput
    //each key maps to an array of ints
      
    Map<Integer, ArrayList<Integer>> friendsMap = new   HashMap<Integer, ArrayList<Integer>>();
    
      //could use an enhanced for loop here instead
      for (int x = 0; x< friendsLength; x++)
      {
          String entry = friendshipsInput[x];
          
          //get the 2 friends from each entry
          String[] namesList = entry.split(",");  
        
          int emp1 = Integer.parseInt(namesList[0]);
          int emp2 = Integer.parseInt(namesList[1]);
        
        /*
        check for the given employee Id if there is already an
        arraylist in the hashmap and if so then we want to get
        that array list and then we want to just add the friend to that array list and then add the array list back to the hashmap
        
        if that employeeId does not have any associated arraylist - no friendslist - then we create a new arraylist, take the friend and add it to that arraylist and then add the arraylist to the hashmap for that particular employeeid
        
        */
        
          /*check if for each employee there is already
            an arraylist of friends in the hash table */
          ArrayList<Integer> emp1Friends = friendsMap.get(emp1);
          ArrayList<Integer> emp2Friends = friendsMap.get(emp2);
        
          ArrayList<Integer> temp = new ArrayList<Integer>();
          
          ArrayList<Integer> temp2 = new ArrayList<Integer>();
        
          //don't want to overwrite existing element in arraylist
         //so first we get it then we add to it
           
          if(emp1Friends != null)
          {
            emp1Friends.add(emp2);
            friendsMap.put(emp1, emp1Friends);      
            //and then put the array back in the hash table
          }
        
         //if nothing there we can just put it in without
         //fear of overwriting anything:
          else  
          {
            temp.add(emp2);  
            friendsMap.put(emp1, temp);
          }
         
         if(emp2Friends != null)
          {
            //and then put the array back in the hash table  
            emp2Friends.add(emp1);
            friendsMap.put(emp2, emp2Friends);
          }
        
          else
            
          {
             temp2.add(emp1);
             friendsMap.put(emp2, temp2);
          }
        
          //otherwise we know that the array is empty 
          //so we just create a new one and then add it       
      }
  
       return friendsMap;
}
}