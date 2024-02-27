public class PrintBoundaries {
  public static void printBoundaries(int arr[][]){
    for (int i = 0; i < arr.length; i++) { 
      for (int j = 0; j < arr[i].length; j++) { 
  
          if (i == 0 || j == 0 || i == arr.length - 1|| j == arr[i].length - 1) { 
              System.out.print(arr[i][j]); 
          } 
          else { 
              System.out.print(" "); 
          } 
      } 
  
      System.out.println(); 
    }
  }
  

 public static void main(String args[]){

 } 

}
