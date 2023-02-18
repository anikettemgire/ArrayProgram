package javatpoint;

public class pratice {
	
	
	 public static void sorting(String a[]) {
		 String temp;
		 for(int i=0;i<a.length;i++) {
			 int flag=0;
			  for(int j=0;j<a.length-1-i;j++) {
				  if(a[j].compareTo(a[j+1])>0) {
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
		 
		  
	  }
	public static void main(String[] args) {
		
		String a[]= {"dipak","anket","aajit","pratik"};
//		//System.out.println("before the sorting----");
//		/for(String i:a) {
//			System.out.print(i+" ");
		//}
		 sorting(a);
		 System.out.println("after the sorting---");
		 for(String b:a) {
			 System.out.println(b+" ");
		 }
		
	}

}
