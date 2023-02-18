package javatpoint;

public class Selcetionsort {
	
	   static void sorting(int a[]) {
		   
		  for(int i=0;i<a.length;i++) {
			    int min=i;
			  for(int j=i+1;j<a.length;j++) {
			
				  if(a[j]<a[min]) {
					   min=j;
				   }
			  }
			   int temp=a[i];
			   a[i]=a[min];
			   a[min]=temp;
//			   for(int k=0;k<a.length;k++) {
//				   System.out.print(a[k]+" ");
//				   
//			   }
//			   System.out.println(" ");
		  }
		   
	   }
	
	  public static void main(String[] args) {
	      int a[]= {38,52,9,18,6,62,13};
	      System.out.println("before Sorting");
	      for(int i:a) {
	    	  
	    	  System.out.print(i +" ");
	      }
	      sorting(a);
	      System.out.println("after The Sorting");
	      for(int b:a) {
	    	  System.out.print(b +" ");
	      }
	      
	}

}
