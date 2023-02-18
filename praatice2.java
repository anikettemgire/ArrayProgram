package javatpoint;

public class praatice2 {
	
	public static void sorting(int a[]) {
	  for(int i=1;i<a.length;i++) {
		  int j=i;
		  int temp=a[i];
		  while(j>0 && a[j-1]>temp) {
			  a[j]=a[j-1];
			  j--;
		  }
		  a[j]=temp;
		  for(int k=0;k<a.length;k++) {
			  System.out.print(a[k]+" ");
		  }
		  System.out.println(" ");
	  }
	}

	public static void main(String[] args) {
		 int a[]= {38,52,9,18,6,62};
//		 System.out.println("before sorting");
//		 for(int c:a) {
//			 System.out.print(c);
//		 }
		 sorting(a);
		 System.out.println("after the sorting");
		 for(int x:a) {
			 System.out.print(x+" ");
		 }

	}

}
