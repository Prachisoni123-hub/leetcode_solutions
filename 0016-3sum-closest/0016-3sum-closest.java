class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // approch 1
    //     int n = nums.length;

    //     Arrays.sort(nums);

    //     int closest = nums[0]+nums[1]+nums[2];

    //     for( int i=0;i<n;i++)
    //     {
    //         for( int j = i+1 ; j<n;j++)
    //         {
    //             for( int k= j+1 ; k<n;k++)
    //             {
    //                 int sum = nums[i]+nums[j]+nums[k];
    //                 if( Math.abs(sum-target) < Math.abs(closest - target))
    //                 {
    //                     closest = sum;
    //                 }
    //             }
    //         }
    //     }
    //     return closest;
        


        // approch 2
        int n = nums.length;
        
        Arrays.sort(nums);

        int closestsum = nums[0]+nums[1]+nums[2];

          for(int  k =0;k<n-2;  k++)
        {
            int i = k+1;
            int j = n-1;

            while( i <j)
            {
                int sum = nums[k] +nums[i]+nums[j]; 

   if(Math.abs(sum-target) < Math.abs( closestsum - target))
   {
    closestsum = sum;
   }
   if( sum == target) return sum;

                if( sum < target ) i++;
                if( sum> target) j--;
                       }
        }
        return closestsum;
     }
}