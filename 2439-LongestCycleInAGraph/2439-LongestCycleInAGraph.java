// Last updated: 9/3/2025, 10:07:38 AM
class Solution {
    public int longestCycle(int[] edges) 
    {
                int ind;
                ArrayList<Integer> path = new ArrayList<>();
                int max,size;
                int prev_ind;
                int ctr;
                int safe_ind;
                int[] len = new int[edges.length];
                ind =0; 
                ctr =1;
                max=-1;
                while ( ind < edges.length)
                {
                        if ((edges[ind]==-1)||len[edges[ind]]!=0)
                        {
                                //System.out.println(ind);
                                ind++;
                                continue;
                        }
                        ctr=1;
                        safe_ind = ind;
                       // System.out.println(ind);
                        while (( ind !=-1) && ( len[ind]==0))
                        {
                                len[ind] =ctr;
                                ctr++;
                                prev_ind = ind;
                                path.add(ind);
                                ind = edges[ind];
                                edges[prev_ind] = -1;

                        }
                        if((ind !=-1) && (len[ind]!=0) && (path.contains(ind)))
                        {
                                size = ctr -len[ind];
                                if(max < size)
                                        max = size;
                        }
                        ind = safe_ind+1;
                        path.clear();
                }
                return max;
    }
}