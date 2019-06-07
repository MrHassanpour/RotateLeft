
package rotateleft;
import java.util.*;
/**
 *
 * @author Alireza Hassanpour
 */
public class RotateLeft {

    
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
         System.out.println("enten number array you want to add :");
         int a = sc.nextInt();
        int [] arr = new int [a];  
        for (int i = 0 ;i < arr.length ; i++){
            System.out.println("Enter num "+ i +"of array :");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number you want ro rotate : ");
        
        int n =sc.nextInt();  
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }
    
}
