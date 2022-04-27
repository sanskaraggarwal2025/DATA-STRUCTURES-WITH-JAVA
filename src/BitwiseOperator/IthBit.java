

public class IthBit {
 public static void main(String[] args) {
  int n = 17;
  int k = 5;
  System.out.println(Integer.toBinaryString(findBit(n, k)));
 }

 static int findBit(int n, int k) {
  return (n & (1 << (k - 1))) >> (k - 1);
 }
 
}
