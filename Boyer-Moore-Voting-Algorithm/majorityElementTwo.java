/* Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.*/
import java.util.*;
class MajorityElement {
  public List<Integer> majorityElement(int[] nums) {
       List<Integer> ans = new ArrayList<Integer>();
       int k = nums.length / 3;
       int element1 = Integer.MIN_VALUE;
       int element2 = Integer.MIN_VALUE;
       int count1 = 0, count2 = 0;
       for(int i = 0; i < nums.length; i++) {
           if(count1 == 0 && nums[i] != element2) {
               element1 = nums[i];
               count1++;
           }
           else if(count2 == 0 && nums[i] != element1) {
               element2 = nums[i];
               count2++;
           }
           else if(nums[i] == element1)
                count1++;
            else if(nums[i] == element2)
                count2++;
            else {
                count1--;
                count2--;
            }
       }
       count1 = count2 = 0;
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] == element1)
                count1++;
           else if(nums[i] == element2)
                count2++;
       }
       if(count1 > k)
            ans.add(element1);
        if(count2 > k)
            ans.add(element2);
        return ans;
    }
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the size of the array");
     List<Integer> ans = new ArrayList<Integer>();
     int size = scanner.nextInt();
     int[] inputArray = new int[size];
     for(int i = 0 ; i < size; i++)
       inputArray[i] = scanner.nextInt();
     ans = majorityElement(inputArray[]);
     System.out.println(ans);
 }
}
