public class Arrays {

  public static void main(String[] args){
    //name of array is numbers
    int numbers[] = {2, 5, 10, 3, 6};
    
    //create object called total
    Arrays total = new Arrays();

    //print total using function
    System.out.println("the sum is " + total.getSum(numbers));

    int v = getTotal(numbers);
    System.out.println("the total is " + v);  
  }
  
  int getSum(int[] a) {
    int sum = 0;
    for (int i : a){
      sum += i;
    }
    //starting from 0, the sum increases with each entry from the numbers aray 
    return sum; 
    //the end sum is displayed
  }

  static int getTotal(int[] a){
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
    //in line 18, int i : a is looking at the index's specific values, bu in line 30, i is the index in the array
  }

}
