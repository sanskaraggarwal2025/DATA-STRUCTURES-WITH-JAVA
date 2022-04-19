public class LinearIterative {
 public static void main(String[] args) {
  int[] arr = { 23, 45, 1, 2, 8, -3, 16, -11, 28 };
  int target = 2;
  int ans = LinearSearch(arr, target);
  System.out.println(ans);
 }

 static int LinearSearch(int[] arr, int target) {
  if (arr.length == 0) {
   return -1;
  }
  for (int i = 0; i < arr.length; i++) {
   int element = arr[i];
   if (element == target) {
    return i;
   }
  }
  return -1;
 }
 
}
