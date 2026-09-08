class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//   [[ 1,  2,  4,  8],
//  [10, 11, 12, 13],
//  [14, 20, 30, 40]]

int n=matrix.length;
int m=matrix[0].length;

int left=0;
int right=n*m-1;



while(left<=right){

    int mid=left+(right-left)/2;
    int val=matrix[mid/m][mid%m];

    if(target==val){
        return true;
    }
    else if(val>target){
        right=mid-1;
    }
    else{
        left=mid+1;
    }
   

    
}

return false;


}
}
