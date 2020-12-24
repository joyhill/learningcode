public class Diameter {
  public static void main(String[] args){
    double diameter = Double.parseDouble(args[0]);
    Diameter object = new Diameter();
    System.out.println("The area of the circle is " + object.getArea(diameter));

  }

  double getArea(double d){
    double area = 0;
    area = (d / 2) * (d / 2) * Math.PI;
    System.out.println("The value of pi is " + Math.PI);
    //remember the pi function
    return area;
    //return always has to be last
  }
}
