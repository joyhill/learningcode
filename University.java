 
public class University {
  public static void main(String[] args){
    String[] array = {"Yale", "Harvard", "Columbia", "Princeton", "Penn"};
    University c = new University();
    College h = c.createList(array);
    //c.printColleges(h);
    c.delCollege(h, "Princeton");
    //c.printColleges(h);
    //c.printChoice(array, 3);
    College d = c.movePenn(h, "Penn");
    c.printColleges(d);
  }

  public College createList(String[] a) {
    College h = new College(a[0], 1);
    College cur = h;
    for (int i = 1; i < a.length; i++) {
      cur.next = new College(a[i], (i+1));
      cur = cur.next;
    }
    return h;
  }

  public void printColleges(College head) {
    College cur = head;
    while (cur != null) {
      System.out.println(cur.rank + " " + cur.name);
      cur = cur.next;
    }
  }

  //

  public void delCollege(College head, String uni) {
    College cur = head;
    while (cur.next.name != uni) {
      cur = cur.next;
    }
    cur.next = cur.next.next;
    reRank(head);
  }

  public void reRank(College head) {
    College cur = head;
    int rank = 1; 
    while (cur != null) {
      cur.rank = rank;
      rank++;
      cur = cur.next;
    }
  }
  
  public void printChoice(String[] a, int r) {
    College h = new College(a[0], 1);
    College cur = h;
    for (int i = 0; i < r; i++) { 
      cur.next = new College(a[i], i);
      cur = cur.next;
    }
    System.out.println("The college is " + cur.name);
  }

  public College movePenn(College head, String uni) {
    College cur = head;
    while (cur.next.name != uni) {
      cur = cur.next;
    }
    cur.next = null; 
    
    College penn = new College(uni, 1);
    
    penn.next = head; 
    reRank(penn);
    return penn; 
  }


  // 
}

class College {
	String name;
  int rank;
  College next;
//constructor
  public College (String name, int rank) {
	  this.name = name;
    this.rank = rank;
  }
}
