import java.util.*;

public class maxHeap {
 public static void main(String[] args) {
  Heap h = new Heap(15);
  h.insert(50);
  h.insert(51);
  h.insert(2);
  h.insert(15);
  h.insert(25);
  h.insert(85);
  h.insert(59);
  h.insert(6);
  // h.print();
  // h.delete();
  // h.print();

  int[] arr = { -1, 52, 51, 50, 53, 54 };
  int n = 5;
  for (int i = n / 2; i > 0; i--) {
   h.heapify(arr, n, i);
  }

  for (int i = 1; i < n; i++) {
   System.out.print(arr[i] + " ");
  }
 }

}

class Heap {
 public int[] arr = new int[50];
 public int size = 0;

 Heap(int size) {
  this.arr[0] = -1;
  this.size = 0;
 }

 public void insert(int val) {
  size = size + 1;
  int index = size;
  arr[index] = val;
  while (index > 1) {
   int parent = index / 2;
   if (arr[parent] < arr[index]) {
    swap(arr[parent], arr[index]);
    index = parent;

   } else {
    return;
   }
  }
 }

 public void delete() {
  if (size == 0)
   System.out.println("Nothing to delete");

  arr[1] = arr[size];
  size--;

  int i = 1;
  while (i < size) {
   int l = 2 * i;
   int r = 2 * i + 1;
   if (l < size && arr[i] < arr[l]) {
    swap(arr[i], arr[l]);
    i = l;
   } else if (r < size && arr[i] < arr[r]) {
    swap(arr[i], arr[r]);
    i = r;
   } else {
    return;
   }
  }
 }

 public void heapify(int[] arr, int n, int i) {
  int largest = i;
  int left = 2 * i;
  int right = 2 * i + 1;

  if (left < size && arr[largest] < arr[left]) {
   largest = left;
  }
  if (right < size && arr[largest] < arr[right]) {
   largest = right;
  }

  if (largest != i) {
   swap(arr[largest], arr[i]);
   heapify(arr, n, largest);
  }
 }

 public void swap(int x, int y) {
  int temp = x;
  x = y;
  y = temp;
 }

 public void print() {
  for (int i = 1; i <= size; i++) {
   System.out.print(arr[i] + " ");

  }
 }
}