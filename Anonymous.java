package javatpoint;

public class Anonymous {
	
	    static void sum(int []a) {
	    	int sum=0;
	    	for(int s:a) {
	    		sum+=s;
	    	}
	    	System.out.println("sum is by using anymous:-"+sum);
	    }

	public static void main(String[] args) {
		   sum(new int [] {10,20,30,40});

	}

}
