public class Google1 {
  public static void main(String[] args){
    double Goog[] = {1732.0, 1726.0, 1746.17, 1763.93, 1761.13};
    Google1 object = new Google1();
    System.out.println("the maximum is " + object.getMax(Goog));
    System.out.println("the minimum is " + object.getMin(Goog));
  }

  double getMax(double[] a){
    double max = a[0];
    for (int i = 1; i < a.length; i++){
      if (max < a[i]) {
        max = a[i]; 
      }
    }
    return max;

  }
  
  double getMin(double[] a){
    double min = a[0];
    for (double i: a){
      if (min > i) {
        min = i;
      }
    }
    return min;

  }

}
