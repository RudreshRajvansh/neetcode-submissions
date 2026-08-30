class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int rows = matrix.length;
        int l = 0,r = rows*col - 1;
        while(l<=r){

            int mid = l + (r-l)/2;
            int rrow = mid/col;
            int rcol = mid%col;
            if(matrix[rrow][rcol] == target){
                return true;
            }else  if(matrix[rrow][rcol] > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}
