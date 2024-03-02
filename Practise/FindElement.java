public class FindElement {
  public static int findEle(int ar[], int ar_size) 
{ 
    
    int val = ar[0]; 
    for (int i = 1; i < ar_size; i++) 
        val = val ^ ar[i]; 
  
    return val; 
} 
public static void main(String args[]){
  int arr[]={1,2,3,4,1};
  System.out.println(findEle(arr,arr.length));
}
  
}
