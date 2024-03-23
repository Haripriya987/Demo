public class MaxWater{

  public static int maxArea(int[] height) {
    int water=0;
    int left=0;
    int right=height.length-1;
    while(left<right){
    int w=right-left;
    int h=Math.min(height[left],height[right]);
    int area=h*w;
    water=Math.max(area,water);
    if(height[left]<height[right])
        left++;
    else if(height[left]>height[right])
        right--;
    else{
        left++;
        right--;
    }            
    
    }
return water;
}


public static void main(String[] args) {
  int arr[]= {1,8,6,2,5,4,8,3,7};
  System.out.println(maxArea(arr));


  
}
}