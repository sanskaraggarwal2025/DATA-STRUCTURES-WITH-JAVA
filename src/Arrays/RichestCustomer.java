import java.util.Scanner;

public class RichestCustomer {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();// row 2
  int m = sc.nextInt();// cols 3
  int[][] accounts = new int[n][m];
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < m; j++) {
    accounts[i][j] = sc.nextInt();

   }
  }
  int maxi = Integer.MIN_VALUE;

  for (int i = 0; i < accounts.length; i++) {
   int sum = 0;
   for (int j = 0; j < accounts[i].length; j++) {
    sum += accounts[i][j];
   }
   maxi = Math.max(maxi, sum);
  }
  System.out.println("The Richest customer wealth is " + maxi);

 }

}
