package Workshop.com;


//Remove Duplicates in a Sorted Array.
public class ArrayFindDublicate {
     public static void  main(String args[]) {
         
	int arr[]=new int []{1,2,3,4,5,3,4,5,6};
	
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]==arr[j]) {
    			   arr[i]=-1;
    		   }
    	   }
       }
       
       System.out.println("removed the dublicate ");
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]!=-1) {
    		   
    		   System.out.print("  "+arr[i]);
    		  
    		  }
    	   }
       }
     }
