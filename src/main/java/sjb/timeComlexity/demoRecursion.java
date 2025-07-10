package sjb.timeComlexity;

public class demoRecursion {
	
	public static int fact (int n) {
		if(n==0||n==1) {
			return 1;
		}
		int result= n*fact(n-1);
		System.out.println(result);
		return result;
		
		
		
		
	}
		
	

	public static void main(String[] args) {
		
 
		demoRecursion recur=new demoRecursion();
		
		System.out.println(recur.fact(5));
		
		;
		}

}
