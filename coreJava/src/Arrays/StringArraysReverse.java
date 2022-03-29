package Arrays;


public class StringArraysReverse {
	
	public static void main(String[] args) {

		String[] strArray = {"a","b","c"};
		
		for(int i =0; i<strArray.length/2; i++) {
			String ar=strArray[i];
			strArray[i] = strArray[strArray.length - i -1];
			strArray[strArray.length-i-1]=ar;
		}
		for(int i=0;i<strArray.length;i++) {
			System.out.print(" "+strArray[i]);
		}
		
	}

}
