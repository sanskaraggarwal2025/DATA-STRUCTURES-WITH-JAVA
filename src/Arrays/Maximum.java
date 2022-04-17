public class Maximum {
 public static void main(String[] args) {
  int[] arr = { 1, 23, 4, 164, 7, 8, };
  System.out.println(maxi(arr));
 }

 static int maxi(int[] arr) {
  int max = arr[0];
  for (int i = 1; i < arr.length; i++) {
   if (max < arr[i]) {
    max = arr[i];
   }
  }
  return max;
 } 
}
