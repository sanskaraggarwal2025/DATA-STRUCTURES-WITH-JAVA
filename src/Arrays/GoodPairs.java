
// https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {
 static int numIdenticalPairs(int[] nums) {
  int i = 0;
  int count = 0;
  while (i < nums.length) {
   for (int j = i + 1; j < nums.length; j++) {
    if (nums[i] == nums[j]) {
     count++;
    }

   }
   i++;
  }

  return count;
 }

 public static void main(String[] args) {
  int[] nums = { 1, 2, 3, 1, 1, 3 };
  System.out.println(numIdenticalPairs(nums));
 }

}
