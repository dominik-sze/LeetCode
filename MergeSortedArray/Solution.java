public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        for(int i=m+n-1; i>=0; i--) {
            if(n<=0) {
                break;
            } else if(m<=0) {
                A[i] = B[--n];
            } else if(A[m-1]<B[n-1]) {
                A[i]=B[--n];
            } else {
                A[i]=A[--m];
            }
        }
    }
}
