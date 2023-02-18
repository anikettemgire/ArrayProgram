package javatpoint;

public class LinerSerarch {
	
	public static void serch_no(int a[],int no) {
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==no) {
				System.out.println("no is found"+i+" locartion");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("no is not found");
		}
			
		
	}
	static void search_name(String b[],String find) {
		int falg=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==find) {
				falg=falg+1;
				System.out.println("String is the found"+i+"loaction");
			}
		}
		if(falg==0) {
			System.out.println("String not found");
		}
	}

	public static void main(String[] args) {
		int a[]= {55,44,78,99,40,69,45};
		String b[]= {"aniket","sam","subod","karik","ankita"};
		String find="subod";
		
		int no=696;
		serch_no(a,no);
		search_name(b,find);
		
	}

}
