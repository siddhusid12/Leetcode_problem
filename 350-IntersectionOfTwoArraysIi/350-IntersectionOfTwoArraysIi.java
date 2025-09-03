// Last updated: 9/3/2025, 10:08:03 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> rl=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                rl.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        } 
        int[] result = new int[rl.size()];
        for (int k = 0; k < rl.size(); k++) {
            result[k] = rl.get(k);
     
    }
    return result;
}
}