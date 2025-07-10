package sjb.timeComlexity;

public class fibonacci {
	
//	static int a=0;
//	static int b=1;
	 
	public int fibonaci(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return fibonaci(n-1)+fibonaci(n-2);
		
	}

	public static void main(String[] args) {
		
		fibonacci fib = new fibonacci();		
		System.out.println(fib.fibonaci(5));
		

	}

}
