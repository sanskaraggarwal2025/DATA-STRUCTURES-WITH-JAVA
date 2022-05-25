
//only right and down moves are allowed.

public class printingPath {
 public static void main(String[] args) {
  // path("",3,3);
  pathDiagonal("", 3, 3);
 }

 static void path(String p, int r, int c) {
  if (r == 1 && c == 1) {
   System.out.println(p);
   return;
  }
  if (r > 1) {
   path(p + 'D', r - 1, c);
  }
  if (c > 1) {
   path(p + 'R', r, c - 1);
  }
 }

 // if diagonal moves are allowed
 static void pathDiagonal(String p, int r, int c) {
  if (r == 1 && c == 1) {
   System.out.println(p);
   return;
  }
  if (r > 1 && c > 1) {
   pathDiagonal(p + 'D', r - 1, c - 1);
  }
  if (r > 1) {
   pathDiagonal(p + 'V', r - 1, c);
  }
  if (c > 1) {
   pathDiagonal(p + 'H', r, c - 1);
  }
 }
}
