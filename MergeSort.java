package javatpoint;

public class MergeSort {
	public static void concer(int a[],int si,int mid,int ei) {
		int[] merge=new int[ei-si+1];
		
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			if(a[idx1]<=a[idx2]) {
				merge[x]=a[idx1];
				x++;
				idx1++;
			}
			else {
				merge[x]=a[idx2];
				x++;
				idx2++;
			}
		}
		while(idx1<=mid) {
			merge[x++]=a[idx1++];
		}
		while(idx2<=ei) {
			merge[x++]=a[idx2++];
		}
		for(int i=0,j=si;i<merge.length;i++,j++) {
			a[j]=merge[i];
			
		}
	}
	
	public static void divide(int a[],int si, int ei) {
		
		if(si>=ei) {
			return ;
		}
		int mid=si+(ei-si)/2; // si+ei/2;
		divide(a,si,mid);
		
		divide(a,mid+1,ei);
		
		concer(a,si,mid,ei);
		
	}
	
	
   public static void main(String[] args) {
	int a[]= {6,3,9,5,2,8};
	int n=a.length-1;
	 divide(a,0,n);
	 for(int i=0;i<n;i++) {
		 System.out.println(a[i]+" ");
	 }
	 System.out.println(" ");
}

}
