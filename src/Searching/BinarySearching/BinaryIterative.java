
public class BinaryIterative {
 public static void main(String[] args) {
  int[] arr = { 1, 34, 56, 76, 75, 98, 156 };
  int target = 156;
  int ans = binarySearchFunc(arr, target);
  System.out.println(ans);
 }

 static int binarySearchFunc(int[] arr, int target) {
  int start = 0;
  int end = arr.length - 1;
  while (start <= end) {
   // find the middle element
   // int mid = (start+end)/2;
   // the upper formula might be wrong when the (start+end) becomes to
   // large that it exceeds the range of int.
   int mid = start + (end - start) / 2; // this the correct formula of finding mid
   if (target < arr[mid]) {
    end = mid - 1;
   } else if (target > arr[mid]) {
    start = mid + 1;
   } else {
    return mid;
   }
  }
  return -1;
 }

}
