/*The algorithm is pretty easy to understand. Imagine we take a tour around this circle, the only condition that we can complete this trip is to have more fuel provided than costed in total. That's what the first loop does.

If we do have more fuel provided than costed, that means we can always find a start point around this circle that we could complete the journey with an empty tank. Hence, we check from the beginning of the array, if we can gain more fuel at the current station, we will maintain the start point, else, which means we will burn out of oil before reaching to the next station, we will start over at the next station.*/

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int c = 0;
        
        for(int i=0; i<gas.length; i++) c += gas[i] - cost[i];
        if(c<0) return -1;
        
        c = 0;
        
        for(int i=0; i<gas.length; i++){
            c += gas[i] - cost[i];
            if(c<0){
                start = i+1;
                c = 0;
            }
        }
        if(start==gas.length) return -1;
        return start;
    }
}