import java.util.Arrays;
public class Swapping {
 public static void main(String[] args) {
  int[] arr = { 1, 3, 5, 7, 9 };
  Swap(arr, 1, 3);
  System.out.println(Arrays.toString(arr));
 }

 static void Swap(int[] arr, int index1, int index2) {
  int temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
 }

}
