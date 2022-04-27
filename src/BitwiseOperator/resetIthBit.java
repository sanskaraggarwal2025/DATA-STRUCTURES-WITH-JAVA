//Resetting means put the particular bit as 0 only.

public class resetIthBit {
 public static void main(String[] args) {
  int n = 69;
  int k = 7;
  System.out.println(Integer.toBinaryString(resetIth(n, k)));

 }

 static int resetIth(int n, int k) {
  return n & ~(1 << (k - 1));

 }

}
