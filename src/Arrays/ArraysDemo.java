package Arrays;
public class ArraysDemo {

	public static void main(String[] args) {

		
		int arr[] = new int[5];
		arr[0]=10;
		arr[1] = new Integer(20);
		
		arr[2] = 30;
		
	System.out.println("Element of the array : ");
	/*	for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
	
	for(int element : arr) {
		System.out.println(element);
	}
	
	long[] arr1 = new long[4];
	for(long element : arr1) {
		System.out.println(element);
	}
	
	}

}
