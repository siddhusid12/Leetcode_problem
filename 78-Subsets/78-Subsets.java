// Last updated: 9/3/2025, 10:09:05 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res=new ArrayList <>();
        backtrack(0,nums,res,new ArrayList <>());
                    return res;

    }
    void backtrack(int index,int [] arr,List<List<Integer>> res,List<Integer> cur){
        if(index==arr.length){
            res.add(new ArrayList<>(cur));
            return ;

        }
        cur.add(arr[index]);
        backtrack(index+1,arr,res,cur);

        cur.remove(cur.size()-1);
        backtrack(index+1,arr,res,cur);
    }
}