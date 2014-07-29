public class Solution {
    public int searchInsert(int[] A, int target) {
        if(A.length==0 || A[0]>=target) {
            return 0;
        }
        if(A[A.length-1]<target) {
            return A.length;
        }
        int start = 0;
        int end = A.length;
        int mid = 0;
        while(start<=end) {
            mid = start + (end-start)/2;
            if(target>A[mid]) {
                if(target<A[mid+1]) {
                    return mid+1;
                }
                start=mid+1;
            } else if(target<A[mid]) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return mid;
    }
}
