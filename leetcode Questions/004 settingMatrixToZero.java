class Solution {
    public void setZeroes(int[][] matrix) {
        //this is to mark
        int flag=0;
       
        //..we flag the first element of the row n column of the matrix which contains zero
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)
                flag=1;
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }    
            }
        }
        
        // we now change the row n column to zero 
        
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;i++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[j][j]=0;
                }
            }  
        }
        if(matrix[0][0]==0){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        
        if(flag==1){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        
    }
}
