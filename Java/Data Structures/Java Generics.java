class Printer
{
   //Generic method for printing any type of array
   public static <E> void printArray(E[] arr){
       for(int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
   }
}