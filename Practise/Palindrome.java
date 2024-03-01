public class Palindrome {

  public static boolean isPalindrome(int x){
    if(x<0){
      return false;
  }        
  int res=0;
  int temp=x;
  while(x>0){
      int rem=x%10;
      res=res*10+rem;
      x=x/10;
  }
  
  return temp==res;
  
}
  public static void main(String args[]){

  }  
  
}
