/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortinganarraylist;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class SortingAnArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        
        do{
        
            Integer num = 10 + r.nextInt(89);
            arr.add(num);
        
        }while(arr.size() < 10);
        
        System.out.println("ArrayList: " + arr);
        
        ArrayList<Integer> arr2 = arr;
        Integer temp =0;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){
             
                if(arr.get(i) > arr2.get(j)){
                
                    temp = arr.get(i);
                    arr.set(i, arr2.get(j));
                    arr2.set(j, temp);
                }
            }
        }
        
        System.out.println("ArrayList: " + arr);
        
    }
}
    

