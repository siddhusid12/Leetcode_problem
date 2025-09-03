// Last updated: 9/3/2025, 10:07:53 AM
class Solution {

    public boolean won(String[][] ar, String who){
        if(ar[1][1]==who && ( (ar[0][0]==ar[1][1] && ar[2][2]==ar[1][1]) || (ar[0][2]==ar[1][1] && ar[2][0]==ar[1][1]) ) )return true;
        for(int i=0;i<3;i++){
        if( (ar[i][0]==who && ar[i][0]==ar[i][1] && ar[i][2]==ar[i][1])|| (ar[1][i]==who && ar[0][i]==ar[1][i] && ar[2][i]==ar[1][i])) return true;
        }
    return false;
    }
    public boolean validTicTacToe(String[] board) {
        String ar[][]=new String[3][3];
        int x=0;
        int o=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                if(board[i].charAt(j)=='X'){
                    ar[i][j]="X";
                    x++;
                    }
                else if(board[i].charAt(j)=='O'){
                    ar[i][j]="O";
                    o++;
                    }
            }
        }
        if(won(ar,"X") && !won(ar,"O") && x==o+1){
            return true;
        }
        else if(!won(ar,"X") && won(ar,"O") && x==o){
            return true;
        }
        else if( (!won(ar,"X") && !won(ar,"O")) && (x==o||x==1+o) ){
            return true;
        }
        else return false;

    }
}