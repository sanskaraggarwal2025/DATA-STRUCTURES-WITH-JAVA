// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcatenation {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] nums = new int[n];
  for (int i = 0; i < n; i++) {
   nums[i] = sc.nextInt();// 1,3,2,1

  }
  int m = 2 * (nums.length);
  int[] ans = new int[m];
  for (int i = 0; i < n; i++) {
   ans[i] = nums[i];
  }
  int i = 0;
  for (int j = n + i; j < m; j++) {
   ans[n + i] = nums[i];
   i++;
  }
  System.out.println(Arrays.toString(ans));

 }

}
