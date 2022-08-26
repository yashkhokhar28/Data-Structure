public class BinarySearch  {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int mid = (0+(arr.length-1))/2;
		int a = -2;
		while (mid!=0 && mid!=arr.length-1) {
			if (a>arr[mid]) {
				mid = (mid + arr.length-1)/2;
			}
			else if (a==arr[mid]) {
				break;
			} 
			else{
				mid /=2;
			}
		}
		if (a==arr[mid]) {
			System.out.print(mid+" , "+arr[mid]);
		} else {
			System.out.print("Not Found");
		}
	}
}