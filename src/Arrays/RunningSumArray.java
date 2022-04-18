// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.*;
import java.util.Scanner;

public class RunningSumArray {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] nums = new int[n];
  for (int i = 0; i < n; i++) {
   nums[i] = sc.nextInt();
  }

  int[] ans = new int[n];
  for (int i = 0; i < n; i++) {
   if (i == 0) {
    ans[i] = nums[i];
   } else {
    ans[i] = ans[i - 1] + nums[i];
   }

  }
  System.out.println(Arrays.toString(ans));
 }

}
