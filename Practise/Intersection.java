import java.util.HashSet;
class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
     int i=0;
     int j=0;
     HashSet<Integer> hs=new HashSet<>();
     while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            hs.add(nums1[i]);
            i++;
            j++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            i++;
        }
     }

    int arr[]=new int[hs.size()];    
    int k=0;
    for(int z:hs){
        arr[k++]=z;
    }

    return arr;
    }

    public static void main(String[] args) {
    int nums1[]={1,2,2,2};
    int nums2[]={2,3,4,5};
    System.err.println(intersection(nums1,nums2));
    }
}