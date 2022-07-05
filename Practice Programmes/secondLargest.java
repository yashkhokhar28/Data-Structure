public class secondLargest{
	public static void main(String[] args) {
		int arr1[] = {-4,-7,-45,0,7,-3,68,-67};
		int i,secondmax=arr1[0];
		int max = arr1[0];
		for (i=0;i<arr1.length;i++ ) {
			if (max<arr1[i]) {
				secondmax = max;
				max = arr1[i];
			}
			else if (secondmax<arr1[i]) {
				secondmax = arr1[i];
			}
		}
		System.out.println("second max is : "+secondmax);
	}
} 