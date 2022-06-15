

//return the size of the set of the union of the given two arrays.
import java.util.*;

public class unionArrays {
 public static void main(String[] args) {
  int[] a = { 5, 10, 15, 5 };
  int[] b = { 10, 15, 4, 5 };
  System.out.println(unionOfArray(a, b));
  
 }

 static int unionOfArray(int[] a, int[] b) {
  Set<Integer> set = new HashSet<>();
  for (int x : a) {
   set.add(x);
  }
  for (int y : b) {
   set.add(y);
  }
  
  return set.size();
 }
}
