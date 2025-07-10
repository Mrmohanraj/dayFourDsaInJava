package sjb.timeComlexity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        //linear Search//
//        
//        linearSearch list= new linearSearch();
//        System.out.println("linearSearch : "+list.liSearch( 2));
//        
//        
//        int[] num = {10,20,30,40,50};
//        int target =50;
//        
//        System.out.println("linearSearch2 : "+list.liSearch2(num, target));
//        
//        //Binary Search//
//        
//        
//        binarySearch ls=new binarySearch();
//        int [] num1 = {10,20,30,40,50,60,70};
//        int target1 = 50;
//        
//        int result = ls.BinarySearch(num1, target1);
//        System.out.println("Binary Search : "+result);
        
        
        //Selection Sort//
        
        SelectionSort sr = new SelectionSort();
        int num2 []= {19,20,1,4,8,9,6,7};
        
       int[] result1 = sr.selectionsort(num2);
       for(int i :result1 ) {
    	   System.out.println(i);
       }
    }
}
