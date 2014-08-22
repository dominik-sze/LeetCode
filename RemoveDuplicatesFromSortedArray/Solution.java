public class Solution {
    public int removeDuplicates(int[] A) {
        int N = A.length;
        if(N==0) {
            return 0;
        }
        int count = 1;
        for(int i=1; i<N; i++) {
            if(A[i] != A[count-1]) {
                A[count++] = A[i];
            }
        }
        return count;
    }
}
