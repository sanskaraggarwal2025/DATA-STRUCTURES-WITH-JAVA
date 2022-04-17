// https://leetcode.com/problems/build-array-from-permutation/submissions/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPermutation {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] nums = new int[n];
  for (int i = 0; i < n; i++) {
   nums[i] = sc.nextInt();
  }
  // Basic Solution
  // int m = nums.length;
  // int[] ans = new int[m];
  // for (int i = 0 ; i < m; i++){
  // ans[i] = nums[nums[i]];
  // }
  // System.out.println(Arrays.toString(ans));

  // Optimised Solution
  int m = nums.length;
  int[] ans = new int[m];
  for (int i = 0; i < m; i++) {
   nums[i] = (nums[nums[i]] % m) * m + nums[i];
  }
  for (int i = 0; i < m; i++) {
   ans[i] = nums[i] / n;
  }
  System.out.println(Arrays.toString(ans));
 }
}
