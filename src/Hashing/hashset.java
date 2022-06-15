
import java.net.SocketTimeoutException;
import java.util.*;
public class hashset {
 public static void main(String[] args) {
  HashSet<Integer> s = new HashSet<>();
  s.add(5);
  s.add(10);
  s.add(20);
  s.add(40);
  System.out.println(s);
  if (s.contains(5)) {
   System.out.println("Element is present");   
  }
  else{
   System.out.println("Element is not present");
  }
  s.remove(10);
  System.out.println(s);
  System.out.println(s.isEmpty());
  System.out.println(s.size());
  s.clear();

 }
}
