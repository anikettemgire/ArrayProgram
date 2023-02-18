package javatpoint;

public class BubbleSort {
	  static void sort(int a[]) {
		  int temp;
		   for(int i=0;i<a.length;i++) {
			   int flag=0;
			   for(int j=0;j<a.length-1-i;j++)
				   
			   {
				   if(a[j]>a[j+1] ){
					   temp=a[j];
					   a[j]=a[j+1];
					   a[j+1]=temp;
					   flag=1;
					   for(int k=0;k<a.length;k++) {
						   System.out.print(a[k]+" ");
					   }
					   System.out.println(" ");
				   }
				   
		   }
			   if(flag==0) {
				   break;
			   }
		   }
		   for(int i=0;i<a.length;i++) {
			   System.out.println(a[i]);
		   }
	  }
		  
	
	
	public static void main(String[] args) {
		int a[]= {90,45,14,49,78,4,98};
		sort(a);

	}

}


