class Solution {
    
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i,j,0,board,word))
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean search(int row,int col, int curr, char[][] board, String word ){
        if (curr==word.length())
            return true;
        if(row<0||row>board.length-1|| col<0||col>board[0].length-1||visited[row][col]==true||word.charAt(curr)!=board[row][col])
            return false;
        visited[row][col]=true;
        boolean patha = search(row+1,col,curr+1,board,word);
        boolean pathb = search(row-1,col,curr+1,board,word);
        boolean pathc = search(row,col-1,curr+1,board,word);
        boolean pathd = search(row,col+1,curr+1,board,word);
        if(patha||pathb||pathc||pathd)
            return true;
        visited[row][col]=false;
        return false;
        
    }
}
