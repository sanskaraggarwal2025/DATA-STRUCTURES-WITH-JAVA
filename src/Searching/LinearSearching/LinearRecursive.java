

import java.util.ArrayList;

public class LinearRecursive {
 public static void main(String[] args) {
  int[] arr = { 1, 2, 3, 4, 5, 6, 6, 8, 9 };
  int target = 6;
  // System.out.println(linearSearch(arr, target, 0));
  System.out.println(linearSearch(arr, target, 0, new ArrayList<>()));
 }

 // static boolean linearSearch(int[] arr, int target, int index) {
 // if (index == arr.length - 1) {
 // return false;
 // }
 // return arr[index] == target || linearSearch(arr, target, index + 1);
 // }

 static ArrayList<Integer> list = new ArrayList<>();

 static ArrayList<Integer> linearSearch(int[] arr, int target, int index, ArrayList<Integer> list) {
  if (index == arr.length) {
   return list;
  }
  if (arr[index] == target) {
   list.add(index);
  }
  return linearSearch(arr, target, index + 1, list);
 }

}
