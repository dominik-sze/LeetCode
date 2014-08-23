public class Solution {
    public int search(int[] A, int target) {
        int N = A.length;
        int beg;
        int end;
        int pivot = findPivot(A);
        if (target > A[N - 1]) {
            beg = 0;
            end = pivot - 1;
        } else {
            beg = pivot;
            end = N - 1;
        }
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] < target) {
                beg = mid + 1;
            } else if (A[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public int findPivot(int[] A) {
        int beg = 0;
        int end = A.length - 1;
        if (A[end]>=A[beg]) {
            return 0;
        }
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] > A[beg]) {
                beg = mid ;
            } else if (A[mid] < A[beg]){
                end = mid;
            } else {
                return end;
            }
        }
        return end ;
    }
}
