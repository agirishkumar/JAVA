import java.util.Scanner;
class arraySum{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. of elements");
      int n = sc.nextInt();	
      int[] array = new int[n];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<n; i++)
      {
    	  array[i] = sc.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}
