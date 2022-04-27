package BitwiseOperator;

//set means setting the particular bit to 1 only not zero
public class setIthBit {
 public static void main(String[] args) {
  int n = 69;
  int k = 5;
  System.out.println(Integer.toBinaryString(setBit(n, k)));

 }

 static int setBit(int n, int k) {
  return n | (1 << k - 1);
 }

}
