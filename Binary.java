package javatpoint;

public class Binary {

	public static void main(String[] args) {
		int a[]= {25,48,98,117,698,885,999,10009,69874};
		int n=a.length;
		int l=0;
		int r=n-1;
		int data=885;
		int falg=0;
		while(l<=r) {
			int mid=(l+r)/2;
			if(data==a[mid]) {
				System.out.println("data is "+a[mid]+" ans"+a[l]+" "+a[r]+" found at the "+mid+"postion");
				falg=1;
				break;
				
			}
			else if(data<a[mid]) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		if(falg==0) {
			System.out.println("data is not found");
		}
		//System.out.println("data is not found");
			
	}

}
