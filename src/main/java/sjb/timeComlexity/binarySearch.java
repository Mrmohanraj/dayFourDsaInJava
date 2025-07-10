package sjb.timeComlexity;

public class binarySearch {
	
	public int BinarySearch(int[] array,int target) {
		int low =0;
		int high=array.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(array[mid]==target) { 
				return mid;
			}
			
			if(array[mid]<target) { 
				low=mid+1;
			}
			
			else { 
				high=mid-1;
			}
			
		
		}
		   return -1;
		   }
	}
