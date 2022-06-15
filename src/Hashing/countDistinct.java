import java.util.*;

public class countDistinct {
 public static void main(String[] args) {
  int[] arr = { 5, 10, 5, 15, 4, 10 };
  System.out.println(countDistincts(arr));
 }

 static int countDistincts(int[] arr) {
  Set<Integer> set = new HashSet<>();
  for (int i = 0; i < arr.length; i++) {
   set.add(arr[i]);
  }
  return set.size();
 }
}
