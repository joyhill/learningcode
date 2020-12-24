public class Google {
  public static void main(String[] args){
    double Goog[] = {1732.0, 1726.0, 1746.17, 1763.93, 1761.13};
    Google average = new Google();
    System.out.println("the average of the stock is " + average.getAve(Goog));

    double ave = calAve(Goog);
    System.out.println("the average is " + ave);
  }

  double getAve(double[] prices){
    double sum = 0;
    for (double i : prices){
      sum += i;
    }
    sum /= prices.length;
    return sum;

  }

  static double calAve(double[] prices){
    double sum = 0;
    for (int i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    sum /= prices.length;
    return sum;
  }


}
