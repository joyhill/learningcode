public class Functions {
  public static void main(String[] args){
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    int num4 = Integer.parseInt(args[3]);
    int total = Sum(num1, num2, num3);
    int total2 = Sum(num1, num2, num3, num4);
    
    float f1 = Float.parseFloat(args[4]);
    float f2 = Float.parseFloat(args[5]);
    float f3 = Float.parseFloat(args[6]);
    float total1 = Sum(f1, f2, f3);
    System.out.println("The total of 3 integers is " + total);
    System.out.println("The total of floats is " + total1);
    System.out.println("The total of 4 integers is "  + total2);

    Functions f = new Functions();
    System.out.println("The getSum is " + f.getSum(num1, num2, num3));
    System.out.println("The getSum4 is " + f.getSum(num1, num2, num3, num4));
  }

  int getSum(int a, int b, int c) {
    int sum = 0;
    sum = a + b + c;
    System.out.println("The sum of 3 integers is " + sum); 
    return sum;
  }


  int getSum(int a, int b, int c, int d) {
    int sum = 0;
    sum = a + b + c + d;
    System.out.println("The sum of 3 integers is " + sum); 
    return sum;
  }
  
  static int Sum(int a, int b, int c, int d) {
    int sum = 0;
    sum = a + b + c + d;
    System.out.println("The sum of 4 integers is " + sum); 
    return sum;


  }

  static int Sum(int a, int b, int c) {
    int sum = 0;
    sum = a + b + c;
    System.out.println("The sum of 3 integers is " + sum); 
    return sum;

  }

  static float Sum(float a, float b, float c) {
    float sum = 0;
    sum = a + b + c;
    System.out.println("The sum of the float numbers is " + sum);
    return sum;


  }

}
