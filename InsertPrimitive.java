import java.util.*;
class InsertPrimitive
{
	 static int insertSorted(int arr[], int n, int key, int capacity)
	 {
 	Scanner s = new Scanner(System.in);
 	  System.out.println(n);
 	  {        
	        if (n >= capacity)
	           return n;
	      
	        arr[n] = key;
	      
	        return (n+1);
	    }
}
    public static void main (String[] args)
    {   
    	 
        int[] arr1 = new int[20]; 
       
        arr1[0] = 122;
        arr1[1] = 165;
        arr1[2] = 220;
        arr1[3] = -40; 
        arr1[4] = 580;
        arr1[5] = -700;
        int capacity = 20;
        int n = 8;
        int i, key = 26;
      
        System.out.print("Before Insertion: ");
        for (i=0; i<n; i++)
            System.out.print(arr1[i]+" ");
      
        // Inserting key
        n = insertSorted(arr1, n, key, capacity);
      
        System.out.print("\nAfter Insertion: ");
        for (i=0; i<n; i++)
            System.out.print(arr1[i]+" ");
    }

}


/*//    //initial array
int[] oldArray = {1,2,3,4,5};

//new value
int newValue = 10;

//define the new array
int[] newArray = new int[oldArray.length + 1];

//copy values into new array
for(int i=0;i < oldArray.length;i++)
    newArray[i] = oldArray[i];
//another solution is to use 
//System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

//add new value to the new array
newArray[newArray.length-1] = newValue;

//copy the address to the old reference 
//the old array values will be deleted by the Garbage Collector
oldArray = newArray;//*/