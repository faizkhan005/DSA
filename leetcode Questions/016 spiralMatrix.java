class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer> result = new ArrayList<>();
    int rows = matrix.length;
    int cols = matrix[0].length;
    // run number of loops for spiral
    // each spiral, it covers two rows, one upper row
    // one lower row, hence loop for half of rows count
    for(int i=0;i<=rows/2;i++) {
        int j=i,k=i;
        //read upper row 
        for(;j<cols-i;j++) result.add(matrix[k][j]);
        // break if read completely
        if(result.size()==rows*cols) break;
        // read right column
        j--;
        k++;
        for(;k<rows-i;k++) result.add(matrix[k][j]);
        // break if read completely
        if(result.size()==rows*cols) break;
        // read lower row
        k--;
        j--;
        for(;j>=i;j--) result.add(matrix[k][j]);
        // break if read completely
        if(result.size()==rows*cols) break;
        // read left column
        j++;
        k--;
        for(;k>=i+1;k--) result.add(matrix[k][j]);
        // break if read completely
        if(result.size()==rows*cols) break;
    }
    return result;   
    }
}
