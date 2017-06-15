package miscprograms;

public class MiscPrograms {
//write a function to find even and odd numbers, will take an integer, boolean 
    public static boolean evensOdds(int num){
        if (num % 2 == 0){
            System.out.println("Even");
            return true;
        }
        else{
            System.out.println("Odd");
            return false;
        }
    }
//isPrime boolean will take an integer
    public static boolean primeNums(int n){
        for(int i=2;i<n/2;i++) {
            if(n%i==0)
            return false;
        }
        return true;
    }

    public static void primeToNum(int n){
        int num = 0;
        String primeNumbers = "";
        for (int i = 0; i<=n; i++){
            int counter = 0;
            for(num=i; num>=1;num--){
                if(i%num==0){
                    counter++;
                }
            }
            if(counter==2){
                primeNumbers=primeNumbers+" "+ i;
            }
        }
        System.out.println(primeNumbers);
    }
 
//u give me number, I give u factorial
     public static int factorial(int n) {
       int result = 1;
       for (int i = 1; i <= n; i++) {
           result = result * i;
       }
       return result;
   }
//function to find summation
    public static int summation(int n) {
       int result = 0;
       for (int i = 0; i <= n; i++) {
           result = result + i;
       }
       return result;
   }
//print fibbinuci up to a certain number
    public static void fibonacci(int n){
        int num1 = 0;
        int num2=1;
        int fibonacci = 0;
        for(int i = 1; i<n; i++){
           fibonacci = num1 + num2;
           num1 = num2;
           num2 = fibonacci;
           System.out.print(" " + fibonacci); 
        }
    }
    
    public static void bubbleSortArray (int [] array){
        int temp;
        System.out.print("......");
        //use a sentinel to indicate if another pass through the array is required
        boolean finished = false;
        while (!finished){
            finished = true;

        //for(int j = 0; j<array.length; j++){
            for (int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    finished = false;
                    //i=-1;
                }
            }
            }
        //}
        
    }
    
    public static void selectionSortArray (int [] array){
        int temp;
        System.out.print("......");

        for(int i = 0; i<array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }
    
    public static int numberOfRepeats(int [] array){
        int counter = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i]==array[i+1])
                counter++;
        }
        return counter;
        
    }
    
    public static void mergeArray(int arr1[], int arr2[]){
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            arr3[arr1.length+j]=arr2[j];
        }
        selectionSortArray(arr3);
        for(int j = 0; j<arr3.length; j++){
            for(int i = 0; i<arr3.length-2; i++){
                if(arr3[i]==arr3[i+1]){
                    arr3[i+1]=arr3[i+2];
                }
            }
        }

        for(int k=0;k<arr3.length-numberOfRepeats(arr3);k++){
            System.out.print(arr3[k]+ " ");
        }   
    }
    
    public static int linearSearch(int[] DSnames,int key){
        for(int i=0;i<DSnames.length;i++){
            if(DSnames[i]==key)
                return i;
        }
        return -1;
    }
    
    public static void newMergeArray(int[] arr1, int[] arr2){
        
        int[]arr3 = new int[arr1.length+arr2.length];
        if (arr1.length>arr2.length){
            for(int i = 0; i<arr1.length;i++){
                arr3[i]=arr1[i];
            }
            int pointer = arr1.length;
            for(int j=0; j<arr2.length; j++){
                if(linearSearch(arr3,arr2[j])==-1){
                    arr3[pointer] = arr2[j];
                    pointer++;
                }
            }
        }
        else{
            for (int i = 0; i<arr2.length; i++){
                arr3[i]=arr2[i];
            }
            int pointer = arr2.length;
            for(int j=0; j<arr1.length; j++){
                if(linearSearch(arr3,arr1[j])==-1){
                    arr3[pointer] = arr1[j];
                    pointer++;
                }
            }
        }
        for (int i = 0; i<arr3.length-numberOfRepeats(arr3)-1;i++){
            System.out.print(arr3[i]+ " ");
        }
        
        
    }
    
    public static void main(String[] args) {

        evensOdds(1);
        
        if(primeNums(13)==true){
            System.out.println("Prime");
        }
        else
            System.out.println("not prime");
        
        
        System.out.println(summation(10));
        
       
        fibonacci(10);
        System.out.println("");
        primeToNum(100);
        
        int Array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        
        int Array2[]= {2,21,3,7,8,22,19,160,120};
        
        mergeArray(Array, Array2);
        System.out.println("");
        System.out.println("");
        newMergeArray(Array, Array2);
        /*
        System.out.println("");
        System.out.println("");
        int Array3[]={5,4,3,2,1};
        selectionSortArray(Array3);
        for(int i = 0; i<Array3.length; i++){
            System.out.print(Array3[i]+ " ")
        }
        */
    }
    
    
}
/*
OUTPUT

Odd
Prime
55
 1 2 3 5 8 13 21 34 55
 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
1 2 3 4 5 6 7 8 9 10 11 BUILD SUCCESSFUL (total time: 0 seconds)
*/
