package javatpoint;

public class Insertionsort {
	
	  static void sorting(int a[]) {
		  int temp,j;
		  for(int i=1;i<a.length;i++) {
			  
			      temp=a[i];
			      j=i;
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
	    int a[]= {79,98,43,12,99,52};
	    System.out.println("before sorting");
	    for(int i:a) {
	    	System.out.print(i+" ");
	    }
	    sorting(a);
	    System.out.println("After the Sorting");
	    for(int c:a) {
	    	System.out.print(c+" ");
	    }
	    

	}

}
