class Solution {
    List<List<String>> outter = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        queens(board,0);
        return outter;
    }
     public void queens(boolean[][] board, int row){
            if(row == board.length){
                display(board);
                return ;
            }
            
            //placing the queen and checking for every row and col
            for(int col=0;col<board.length;col++){
                //place the queen if its safe 
                if(isSafe(board,row,col)){
                    board[row][col]= true;
                    queens(board,row + 1);
                    board[row][col] = false;
                }     
            }
        }
        
        private  boolean isSafe(boolean[][] board,int row,int col){
            // check vertical row
            for(int i=0;i<row;i++){
                if(board[i][col]){
                    return false;
                }
            }
            //diagonal left
            int maxLeft = Math.min(row,col);
            for(int i=1;i<=maxLeft;i++){
                if(board[row-i][col-i]){
                    return false;
                }
            }
            //diagonal right
            int maxRight = Math.min(row,board.length-col-1);
            for(int i=0;i<=maxRight;i++){
                if(board[row-i][col+i]){
                    return false;
                }
            }
            return true;
        }
        
        private  void display(boolean[][] board){
            List<String>list = new ArrayList<>();
            String p;
            for(boolean[] row:board){
                p ="";
                for(boolean element:row){
                    if(element){
                        p +="Q";
                    }
                    else{
                        p +=".";
                    }
            }
                list.add(p);
        }
            outter.add(list);
    }
}
