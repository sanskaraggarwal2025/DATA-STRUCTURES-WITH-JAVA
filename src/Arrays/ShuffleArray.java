// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of m ");
  int m = sc.nextInt();
  int[] nums = new int[m];// m = 6
  for (int i = 0; i < m; i++) {
   nums[i] = sc.nextInt();// [2,5,1,3,4,7]
  }
  System.out.println("Enter the value of n ");
  int n = sc.nextInt();
  int[] ans = new int[2 * n];
  int j = 0;
  for (int i = 0; i < 2 * n; i = i + 2) {
   ans[i] = nums[j];
   ans[i + 1] = nums[n + j];
   j++;
  }
  System.out.println(Arrays.toString(ans));

 }

}
