package sjb.timeComlexity;

public class linearSearch {
	
	//declaring array in starting
	
	int[] array= {1,2,3,4,5,6,7};
	
	
	public int liSearch( int target) {
		
		
		for(int i=0; i<array.length;i++) {
			if(array[i] == target) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	//passing array as a parameter
	public int liSearch2( int[] array,int target) {
		
		
		for(int i=0; i<array.length;i++) {
			if(array[i] == target) {
				return i;
			}
			
		}
		return -1;
		
	}

	

}


