public class BasicArrays{
 public static void main(String[] args) {
  // syntax
  // datatype[] variable_name = new datatype[size];
  // store 5 roll numbers:
  // int[] arr = new int[5];

  // // or directly
  // int[] arr1= {23, 12, 45, 32, 15};

  int[] arr; // declaration of array. ros is getting defined in the stack
  arr = new int[5]; // initialisation: actually here object is being created in the memory (heap)

  // System.out.println(arr[1]);

  String[] ar1 = new String[4];
  System.out.println(arr[0]);

  for (String element : ar1) {
   System.out.println(element);
  }
 }
}