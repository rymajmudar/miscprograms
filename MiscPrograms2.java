
package miscprograms;

public class MiscPrograms2 {
    
    public static int binarySearch(int[] array, int num) {
        int lowerBound =0;
        int upperBound = array.length-1;
        while (lowerBound<=upperBound){
            int midpoint = (lowerBound + upperBound)/2;
            if(array[midpoint]==num)
                return midpoint;
            else if (array[midpoint]<num)
                lowerBound = midpoint+1;
            else
                upperBound = midpoint-1;
        }
        return -1;
    }
    
    public static void printFlag(int n) {
        for (int i = 0; i<n; i++){
            System.out.println("*");
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
        }
    }
    public static void reverseArray(int inputArray[]){
        int temp;    
        for (int i = 0; i < inputArray.length/2; i++){
            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }   
    }
    
    public static void mirrorArray(int[] array) {

        int[] newArray=new int[2*array.length-1];
        for(int i = 0;i<array.length;i++){
            newArray[i]=array[i];
        }
        reverseArray(array);
        
        for(int i = array.length;i<newArray.length;i++){
            newArray[i]=array[i];
        }
        for(int i = 0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
        
    }
    public static void main(String[] args) {
    
       /* 
        int Array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        
        int Array2[]= {2,21,3,7,8,22,19,160,120};
        System.out.println(binarySearch(Array,4));
        */
       //printFlag(8);
        //System.out.println("");
        int[] A = {3, 5, 6, 7, 19, -21};
        reverseArray(A);
        for (int i = 0;i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        mirrorArray(A);
        /*
        printFlag(7)
        *
        ***
        *****
        *******
        *****
        ***
        *

        printFlag(11)
        *
        ***
        *****
        *******
        *********
        ***********
        *********
        *******
        *****
        ***
        *
        */
    }
    
}
