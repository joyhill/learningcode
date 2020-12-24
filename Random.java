public class Random {
  public static void main(String[] args){
    int lowerBound = Integer.parseInt(args[0]);
    int upperBound = Integer.parseInt(args[1]);

    for (int j = 0; j < 10; j++){
      int random = getRandom(lowerBound, upperBound);
      System.out.println("The random number is " + random);
    }
  }

  static int getRandom(int low, int up) {
    int i = (int)(Math.random() * (up - low)) + low;
    return i;
  } 

}
