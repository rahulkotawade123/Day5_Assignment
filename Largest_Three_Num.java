package Day_5_Assignment;

public class Largest_Three_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int[] {25,11,7,77,56};
		int max = a[0];
		for (int i=0; i<a.length;i++) {
			if (a[i]>max)
			max = a[i];
		}
		System.out.println("largest element present in given array:"+max);
	}
	}


