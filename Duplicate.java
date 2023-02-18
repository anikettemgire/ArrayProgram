package javatpoint;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		  int a[]= {80,45,14,22,80,14,4,4,69};
		  Set<Integer> s=new HashSet<>();
		  for(int no:a) {
			  if(s.add(no)==false) {
				  System.out.println(no);
			  }
		  }
	}
}