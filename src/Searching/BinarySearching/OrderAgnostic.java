/*
Suppose you are given an array which is sorted but you don't know whether
the given array is in ascending order or descending order then how will you
write the code of binary search.that is called orderAgnostic binary search
*/

public class OrderAgnostic {
 public static void main(String[] args) {
  int[] arr = { -22, -12, 0, 34, 67, 87, 90, 123, 456, 789 };
  int target = 67;
  int ans = orderAgnosticBS(arr, target);
  System.out.println(ans);
 }

 static int orderAgnosticBS(int[] arr, int target) {
  int start = 0;
  int end = arr.length - 1;
  // find whether the array is in ascending or descending order
  boolean isAsc = arr[end] > arr[start];
  while (start <= end) {
   int mid = start + (end - start) / 2;
   if (arr[mid] == target) {
    return mid;
   }
   if (isAsc) {
    if (target > arr[mid]) {
     start = mid + 1;
    } else if (target < arr[mid]) {
     end = mid - 1;
    }

   } else {
    if (target < arr[mid]) {
     start = mid + 1;
    } else if (target > arr[mid]) {
     end = mid - 1;
    }

   }
  }
  return -1;
 }
}
