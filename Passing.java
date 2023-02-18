package javatpoint;

public class Passing {
	
	   static int max(int a[]) {
	    	int max=a[0];
	    	for(int i=0;i<a.length;i++) {
	    		 if(a[i]>max) {
	    			 max=a[i];
	    		 }
	    		
	    	}
	    	  return max;
	    	
	    }

	public static void main(String[] args) {
		
       int a[]= {10,20,455,7,63};
      int result= max(a);
      System.out.println("maxi"+result);
	}

}
