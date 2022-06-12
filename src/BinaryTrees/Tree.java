
import java.util.Scanner;

public class Tree{

 static Scanner sc = null;
 public static void main(String[] args) {
  sc = new Scanner(System.in);

  // createTree();
  Node root = createTree();
  inOrderTraversal(root);
  System.out.println();
  preOrderTraversal(root);
  System.out.println();
  postOrderTraversal(root);
  
 }

 static Node createTree(){
  Node root = null;
  System.out.println("Enter the Data: " + " ");
  int data = sc.nextInt();
  
  if(data == -1) return null;
  root = new Node(data);

  System.out.println("Enter the left for: " + data );
  root.left = createTree();


  System.out.println("Enter the right for: " + data );
  root.right = createTree();

  return root;

 }
 //All the below traversals are Depth first Search (DFS)
 static void inOrderTraversal(Node root){  //LNR
  if (root == null)
   return;

  inOrderTraversal(root.left);
  System.out.print(root.data + " ");
  inOrderTraversal(root.right);
 }
 static void preOrderTraversal(Node root){  //NLR
  if (root == null)
   return;

   System.out.print(root.data + " ");
  preOrderTraversal(root.left);
  preOrderTraversal(root.right);
 }

 static void postOrderTraversal(Node root){  //LRN
  if (root == null)
   return;

  postOrderTraversal(root.left);
  postOrderTraversal(root.right);
  System.out.print(root.data + " ");
 }
}


class Node {
 Node left, right;
 int data;

 public Node(int data) {
  this.data = data;
 }
}