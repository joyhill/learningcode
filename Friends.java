public class Friends{
  public static void main(String[] args){
  
    String[] best = {"Grace", "Katie", "Adrianne", "Ivilyn", "Shoshana", "Elwing"};

    for (int i = 0; i < best.length; i++) {
      System.out.print(best[i] + " ");
    }
    System.out.println();

    for (int i = (best.length - 1); i >= 0; --i) {
      System.out.print(best[i] + " ");

    }
    System.out.println();
    int len = best.length;
    for (int i = 0; i < (len / 2); i++) {
      String temp = best[i];
      best[i] = best[len - (i+1)];
      best[len - (i+1)] = temp;
    }
    
    //String temp = best[0];
    //best[0] = best[4];
   // best[4] = temp;
    //temp = best[1];
    //best[1] = best[3];
   // best[3] = temp;
    
    for (int i = 0; i < best.length; i++) {
      System.out.print(best[i] + " ");
    }
    System.out.println();
  }
  

}
