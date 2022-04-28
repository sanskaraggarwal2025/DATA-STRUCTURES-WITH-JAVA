package BitwiseOperator;

//In an array every number appears twice only one number appears once find that
// number.
public class findUnique {
 public static void main(String[] args) {
  int[] arr = { 2, 3, 3, 4, 2, 6, 4 };
  System.out.println(ans(arr));
 }

 static int ans(int[] arr) {
  int res = 0;
  for (int i : arr) {
   res = res ^ i; // XOR operator
  }
  return res;
 }

}
