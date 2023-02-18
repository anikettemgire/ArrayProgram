package javatpoint;

public class DirectSort {

	public static void main(String[] args) {
		  int a[]= {39,19,29,12,5};
		  int temp;
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]>a[j]) {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
//				  for(int k=0;k<a.length;k++) {
//					  System.out.print(a[k]+" ");
//				  }
//				  System.out.println(" ");
			  }
			  
		  }
		  for(int  i=0;i<a.length;i++) {
			  System.out.println(a[i]);
		  }

	}

}
