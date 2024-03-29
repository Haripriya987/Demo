class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] me=new int[nums1.length+nums2.length];
     int i=0,j=0,k=0;
     while(i<nums1.length && j<nums2.length){
         if(nums1[i]<nums2[j]){
             me[k++]=nums1[i++];
         }
         else if(nums1[i]>=nums2[j]){
             me[k++]=nums2[j++];
         }
      } 
      while(i<nums1.length){
               me[k++]=nums1[i++];
      }
      while(j<nums2.length){
               me[k++]=nums2[j++];
      }
      int mlen=me.length;
      double median=0;
      if(mlen%2!=0){
          median=me[mlen/2];
      }
      else{
          double a=me[mlen/2];
          double b=me[(mlen/2)-1];
          median=(a+b)/2;
      }
      return median;
  }
}