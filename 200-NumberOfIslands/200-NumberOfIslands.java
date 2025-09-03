// Last updated: 9/3/2025, 10:08:24 AM
class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)
          return 0;
        int i_count=0;
        int row=grid.length;
        int col=grid[0].length;

        int[][] d={{-1,0}, //up
                   {1,0},  //down
                   {0,1},  //right
                   {0,-1}    //left
                    };
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    i_count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty())
                    {
                        int[] pos=q.poll();
                        int x=pos[0];
                        int y=pos[1];
                        grid[i][j]='0';

                        for(int[] dir:d)
                        {
                            int X=x+dir[0];
                            int Y=y+dir[1];
                            if(X>=0 && Y>=0 && X<row &&Y<col &&grid[X][Y]!='0')
                            {
                                q.offer(new int[]{X,Y});
                                grid[X][Y]='0';
                            }
                        }
                    }
                }
            }
        }
       return i_count;         
    }
}





