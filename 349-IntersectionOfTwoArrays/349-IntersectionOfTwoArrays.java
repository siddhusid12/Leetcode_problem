// Last updated: 9/3/2025, 10:08:04 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int a=Math.min(nums1.length,nums2.length);
        int arr[]=new int[a];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                        boolean dup=false;

                        for(int x=0;x<k;x++){
                            if(arr[x]==nums1[i]){
                                dup=true;
                                break;
                            }
                        }
                        if(!dup){
                            arr[k++]=nums1[i];
                        }
                        break;
                }
            }
        }
        int finalres[]=new int[k];
        for(int i=0;i<k;i++){
            finalres[i]=arr[i];
        }
         return finalres;
    }
}