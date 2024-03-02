public class Garden {

  public boolean canPlaceFlowers(int[] flowers, int n) {
    int len=flowers.length;
  
    for(int i=0;i<len;i++){
     int left= i==0?0:flowers[i-1];
     int right= i==len-1?0:flowers[i+1];
     if(flowers[i]+left+right==0){
         flowers[i]=1;
         n--;
     }
  
    }
  
    return n<=0;
  
  }
  
  public static void main(String args[]){
    
  }  
}
