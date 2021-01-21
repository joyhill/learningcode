public class house {
  public String address;
  private String owner;
  private int bedroom;
  private int bathroom;
  public static final String DEFAULT_OWNER = "people";

  public house(String address, String owner){
    this.address = address;
    this.owner = owner;
  }

  public house(String address, int bedroom, int bathroom) {
    this.address = address;
    this.bedroom = bedroom;
    this.bathroom = bathroom;
  }

  public static void main(String[] args){
    house h1 = new house("cupertino", DEFAULT_OWNER);

    house h2 = new house("San Jose", 3, 2);

    printHouseInfo(h1);

    System.out.println("Main: h1 owner = " + h1.owner);
  }

  static String printHouseInfo(house h1) {

    System.out.println("In function: h1 owner = " + h1.owner);
    h1.owner = "amy";
    return h1.owner;
  }

}
