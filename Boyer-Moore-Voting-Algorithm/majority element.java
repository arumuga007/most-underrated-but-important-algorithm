/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. */
import java.util.*;
class MajorityElement {
 public static int majorityElement(int[] nums) {
        int count = 0, element = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                element = nums[i];
                count++;
            }
            else if(nums[i] == element) 
                count++;
            else
                count--;                
        }
        return element;
    }
 public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int size = scanner.nextInt();
     int[] inputArray = new int[size];
     for(int i = 0 ; i < size; i++)
       inputArray[i] = scanner.nextInt();
     int ans = majorityElement(inputArray[]);
     System.out.println(ans);
 }
}
