
public class DuplicateNumbers {
 public static void main(String[] args) {
  int[] nums = { 1, 3, 4, 3, 2 };
  System.out.println(duplicateNumber(nums));
 }

 static int duplicateNumber(int[] nums) {
  int i = 0;
  while (i < nums.length) {
   if (nums[i] != i + 1) {
    int correct = nums[i] - 1;
    if (nums[i] != nums[correct]) {
     swap(nums, i, correct);
    } else {
     return nums[i];
    }
   } else {
    i++;
   }
  }
  return -1;
 }

 static void swap(int[] nums, int first, int second) {
  int temp = nums[first];
  nums[first] = nums[second];
  nums[second] = temp;
 }
}
