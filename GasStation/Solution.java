public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int leftGas = 0;
        int start   = 0;
        for(int i=0; i<gas.length; i++) {
            leftGas += gas[i]-cost[i];
            if(leftGas<0) {
                leftGas = 0;
                start   = i+1;
            }
        }
        if(start==gas.length) {
            return -1;
        }
        int get = 0;
        for(int i=0; i<start; i++) {
            get += gas[i]-cost[i];
        }
        if(get+leftGas>=0) {
            return start;
        } else {
            return -1;
        }
    }
}
