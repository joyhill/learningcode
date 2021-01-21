public class Value {
  public static void main(String[] args){
    int[] number = {1, 2, 8, 11, 15, 20, 21, 25};
    Value object = new Value();
    System.out.println("The index is " + object.binarySearch(number, 0, 7, 1));
  }

  int binarySearch(int[] a, int start, int end, int value) {
	  if (start == end) {
		  return start;
	  }
	  int mid = (start + end)/2;
	  if (a[mid] == value) {
		  return mid;
	  } else if (a[mid] < value) {
		  return binarySearch(a, mid+1, end, value);
    } else {
		  return binarySearch(a, start, mid-1, value); 
    }
  }

}
