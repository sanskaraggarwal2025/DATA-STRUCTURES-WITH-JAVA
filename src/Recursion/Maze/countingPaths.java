

public class countingPaths {

 public static void main(String[] args) {
  System.out.println(countPath(3, 3));
 }

 static int countPath(int r, int c) {
  if (r == 1 || c == 1) {
   return 1;
  }
  int down = countPath(r - 1, c);
  int right = countPath(r, c - 1);

  return down + right;
 }
}
