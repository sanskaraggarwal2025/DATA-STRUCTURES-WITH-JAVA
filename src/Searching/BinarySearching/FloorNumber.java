
public class FloorNumber {
 public static void main(String[] args) {
  int[] arr = { -12, 0, 3, 9, 13, 16, 25 };
  int target = 15;
  int ans = Floor(arr, target);
  System.out.println(ans);
 }

 static int Floor(int[] arr, int target) {
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
  return arr[end];
 }
}
