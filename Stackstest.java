import java.io.*; 
import java.util.*; 

public class stackstest {
  public static void main(String[] args) {
    char[] s = {'{','{','1','[','2','3',']','(','4',')','5','}','6','}'};
    stackstest a = new stackstest();
    boolean b = a.isValid(s);
    System.out.println(b);
  }
  boolean isValid(char[] a) {
    Stack<Character> st = new Stack<>();
    for (char c : a) {
      if ( (c == '{') || (c == '[') || (c == '(' )){
        st.push(c);
      } else if ((c == '}') || (c == ']') || (c == ')' )) {
        if (st.isEmpty()) return false;
        char left = st.pop();
        if (!match(left, c)) return false;
      }
    }
    if (st.isEmpty()) return true;
    return false;
  }

  boolean match (char left, char right) {
    if (left == '{') {
      if (right == '}') return true;
      return false;
    } else if (left == '[') {
      if (right == ']') return true;
      return false;
    } else if (left == '(') {
      if (right == ')') return true;
      return false;
    }
    return false;
    }
  }

//how to use stack to print preorder
void printPreOrder(TreeNode root) {
  if (root == null) return;
  Stack<TreeNode> st = new Stack<>();
  st.push(root);
  while (!st.isEmpty()) {
    TreeNode cur = st.pop();
    System.out.print(cur.val + " ");
    if (cur.right != null) st.push(cur.right);
    if (cur.left != null) st. push(cur.left);
  }
}

void printPostOrder(TreeNode root) {
  if (root == null) return;
  Stack<TreeNode> st = new Stack<>();
  Stack<TreeNode> st1 = new Stack<>();
  st.push(root);
  while (!st.isEmpty()) {
    TreeNode cur = st.pop();
    st1.push(cur);
    if (cur.left != null) st.push(cur.left);
    if (cur.right != null) st.push(cur.right);
  }
  while (!st1.isEmpty()) {
    TreeNode cur1 = st1.pop();
    System.out.print(cur1.val + " ");
  }
}
