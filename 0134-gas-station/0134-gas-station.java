class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int sumgas =0;
        int sumcost =0;

        // total gas and total cost

        for(int i =0;i<n;i++)
        {
            sumgas +=gas[i];
            sumcost += cost[i];
        }

       // Agar total gas < total cost,
        // toh circuit complete karna impossible hai
        if( sumgas < sumcost) return -1;

        int total =0;
        int result =0;
           for (int i = 0; i < n; i++) {
            total += gas[i]-cost[i];

             // Current starting point fail ho gaya
             if(total < 0)
             {
                total =0;
                result = i+1;
             }
           }
           return result;



        
    }
}