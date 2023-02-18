package javatpoint;

public class Return {
	
	   static int[] get() {
	    	int a[]= {10,20,30,40,50};
	    	
	    	return a;
	    }

	public static void main(String[] args) {
		    int b[]=get();
		    for(int c:b) {
		    	System.out.println(c);
		    }

	}

}
