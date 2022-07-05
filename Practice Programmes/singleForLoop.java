class calculateLoop{
	int arr1[] = {0,0,0,1,1,1};
  	public void checkNumber(){
  		int max = arr1[0];
  		for (int i=0;i<arr1.length;) {
  			if (arr1[i]==arr1[i+1] && arr1[i+1]==arr1[i+2] && arr1[i+2]==arr1[i]) {
  				if (max<=arr1[i]) {
  					i++ ;
  					
  				}
  			}
  			else{
  				continue;
  			}
  		}
  	}
}
  public class singleForLoop{
  	public static void main(String[] args) {
  		calculateLoop c1 = new calculateLoop();
  		c1.checkNumber();
  	}
  }