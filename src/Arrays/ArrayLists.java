
import java.util.ArrayList;
public class ArrayLists {
 public static void main(String[] args) {
  // syntax
  ArrayList<Integer> list = new ArrayList<>();
  list.add(23);
  list.add(24);
  list.add(25);
  list.add(26);
  list.add(27);
  System.out.println(list);
  // System.out.println(list.contains(25));
  // list.set(0,100);
  list.remove(2);
  System.out.println(list.get(1));// list[syntax] will not work here
  System.out.println(list);

 }
 
}
