
public class BinaryRecursive {
 public static void main(String[] args) {
  int[] arr = { 2, 34, 65, 78, 97, 123, 567 };
  int target = 68;
  int ans = binarySearch(arr, target, 0, arr.length - 1);
  System.out.println(ans);
 }

 static int binarySearch(int[] arr, int target, int s, int e) {
  if (s > e) {
   return -1;
  }
  int mid = s + (e - s) / 2;
  if (arr[mid] == target) {
   return mid;
  }
  if (arr[mid] < target) {
   return binarySearch(arr, target, mid + 1, e);
  }
  return binarySearch(arr, target, s, mid - 1);
 }

}
