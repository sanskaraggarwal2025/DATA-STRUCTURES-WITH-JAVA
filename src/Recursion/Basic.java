
public class Basic {
 public static void main(String[] args) {
  print(5);
 }

 static int print(int n) {
  if (n == 0) {
   return 0;
  }
  System.out.println(n);
  return print(n - 1);

 }

}
