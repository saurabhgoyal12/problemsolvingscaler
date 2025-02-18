/**
*   Max Sum Contiguous Subarray
*   Find the maximum sum of contiguous non-empty subarray within an array A of length N.
*   1 <= N <= 1e6
*   -1000 <= A[i] <= 1000
**/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int n = A.length;
        int maxSum = A[0];
        int totalContribution = 0;
        boolean allNegative = true;
        int biggestNegative = A[0];
        for(int i=0; i<n; i++){
            if(allNegative){
                if(A[i]>0){
                    allNegative = false; 
                }
                else if(biggestNegative < A[i]){
                    biggestNegative = A[i];
                }    
            }
            totalContribution = totalContribution + A[i] > 0 ? totalContribution + A[i] : 0;
            maxSum = totalContribution > maxSum ? totalContribution : maxSum;
        }
        if(allNegative){
            return biggestNegative;
        }
        else{
            return maxSum;
        }
    }
}
